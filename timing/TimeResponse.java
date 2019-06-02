package timing;

import java.rmi.*;

// remote interface
public interface TimeResponse extends Remote {
	long getTime(long time) throws RemoteException;
}