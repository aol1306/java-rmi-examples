package simple;

import java.rmi.*;

// client class
// calls remote hello() method
public class Greet {
	public static void main(String[] args) {
		try {
			Hello h = (Hello)Naming.lookup("hello");
			h.hello();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}