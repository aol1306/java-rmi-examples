package timing.client;

import timing.*;
import java.rmi.*;

public class TimeClient {
	
	public static void main(String[] args) {
		try {
			// lookup remote object
			String name = "//localhost:2003/TimeServer";
			ServerProducer sp = (ServerProducer)Naming.lookup(name);
			
			// call remote method
			TimeResponse ts = sp.getServer();
			
			long then = System.currentTimeMillis();
			System.out.println("client before: " + then);
			long retv = ts.getTime(then); // call remote method
			long now = System.currentTimeMillis();
			System.out.println("server returns: " + retv);
			System.out.println("client after: " + now);
			System.out.println("calling time: " + (now - then));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}