package timing.server;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class TimeServer extends UnicastRemoteObject implements timing.TimeResponse {
	public TimeServer() throws RemoteException {};
	
	public long getTime(long time) throws RemoteException {
		long here = System.currentTimeMillis();
		System.out.println("Server in: " + time + "\n" +
						   "Server out: " + here);
		return here;
	}
}