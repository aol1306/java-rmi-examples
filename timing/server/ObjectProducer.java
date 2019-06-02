package timing.server;

import timing.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class ObjectProducer extends UnicastRemoteObject implements ServerProducer {
	public ObjectProducer() throws RemoteException {};
	
	public TimeResponse getServer() throws RemoteException {
		System.out.println("TimeServer created");
		return new TimeServer();
	}
	
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(2003);
			ObjectProducer op = new ObjectProducer();
			Naming.bind("//localhost:2003/TimeServer", op);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}