package V_Network_Programming;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx {
public static void main(String[] args) {
	try {
		String address = "localhost";
		int port = 2222;
		// Creates a stream socket and connects it to the specified port number on the named host.
	    Socket s = new Socket(address, port);
	    // Returns an output stream for this socket.
	    OutputStream os = s.getOutputStream();
	    // Returns an input stream for this socket.
	    InputStream is = s.getInputStream();
	    // Memory allocated sending purpose 
	    byte [] b1 = new byte[100];
	    // Memory allocated receving purpose 
	    byte [] b2 = new byte[100];
	    while(true) {
	    	// display on screen
	    	System.out.println("To Server:");
	    	// read whatever enter store in b1
	    	System.in.read(b1);
	    	// send to Server
	    	os.write(b1);
	    	// received from Server
	    	is.read(b2);
	    	// converting into string
	    	String s1 = new String();
	    	// Extra spaces removing
	    	String s2 = s1.trim();
	    	// Display
	    	System.out.println("From Server:"+ s2);
	    }
		
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
