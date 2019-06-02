package simple;

import java.rmi.*;

// remote object interface
// must 1. be public 2. extend Remote 3. every method throws RemoteException
public interface Hello extends Remote {
	void hello() throws RemoteException;
}