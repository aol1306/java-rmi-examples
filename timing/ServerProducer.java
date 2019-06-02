package timing;

import java.rmi.*;

// remote interface
public interface ServerProducer extends Remote {
	TimeResponse getServer() throws RemoteException;
}