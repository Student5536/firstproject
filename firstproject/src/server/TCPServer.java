package server;

import java.io.*;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {  // Server
	
	public static void main(String[] args)  {
		
		int port = 9806;
		try
		{
		    System.out.println("Waiting for clients....");
			ServerSocket ss = new ServerSocket(port);
			Socket soc = ss.accept();
			System.out.println("Connection is established");
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str = in.readLine();
			PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
			out.println("Server says: "+ str.charAt(0));
			
			ss.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
