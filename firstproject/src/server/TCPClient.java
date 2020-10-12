package server;

import java.io.*;
import java.net.*;

public class TCPClient {
	
	
	public static void main(String[] args) {
		
		
		try
		{
			System.out.println("Client started");
			Socket soc = new Socket("localhost", 9806);
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a string");
			String str = userInput.readLine();
			PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
			Thread.sleep(5000);
			out.println(str);
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			System.out.println(in.readLine());
			soc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
