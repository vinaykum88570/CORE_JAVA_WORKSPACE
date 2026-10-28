package V_Network_Programming;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerEx {
public static void main(String[] args) {
	try {
		int port = 2222;
		// Creates a server socket, bound to the specified port.
		ServerSocket ss = new ServerSocket(port);
		// to this socket and accepts it.
		Socket s = ss.accept();
		// Returns an output stream for this socket.
		InputStream is = s.getInputStream();
		// Returns an input stream for this socket.
		OutputStream os = s.getOutputStream();
		// Memory allocated sending purpose 
		byte [] b1 = new byte[100];
		// Memory allocated receving purpose 
		byte [] b2 = new byte[100];
		while (true) {
			is.read(b1);
			// Converting Into String 
			String s1 = new String(b1);
			// Removing extra spaces
			String s2 = s1.trim();
			// Display 
			System.out.println("From Client:"+ s2);
			System.out.println("To Client:");
			System.in.read(b2);
			os.write(b2);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
