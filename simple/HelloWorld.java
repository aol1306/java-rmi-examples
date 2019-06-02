package simple;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

// server (remote object) class
// needs to extend UnicastRemoteObject
public class HelloWorld extends UnicastRemoteObject implements Hello {
	
	// constructor throws RemoteException
	public HelloWorld() throws RemoteException {}
	
	public void hello() throws RemoteException {
		System.out.println("Hello world!");
	}
	
	public static void main(String[] args) {
		try {
			HelloWorld hw = new HelloWorld();
			Naming.bind("hello", hw); // add binding to registry
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}