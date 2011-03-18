package mcs.MediaRemote;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

import android.util.Log;


public class TCPClient implements Runnable {


	public void run() 
	{
		try 
		{
			InetAddress serverAddr = InetAddress.getByName("127.0.0.1");
			Log.d("TCP", "C: Connecting...");
			Socket socket = new Socket(serverAddr, 4444);
			String message = "Hello from Client android emulator";
			try 
			{
				Log.d("TCP", "C: Sending: '" + message + "'");
				PrintWriter out = new PrintWriter( new BufferedWriter( new OutputStreamWriter(socket.getOutputStream())),true); 
				out.println(message);
				Log.d("TCP", "C: Sent.");
				Log.d("TCP", "C: Done.");
			} 
			catch(Exception e) 
			{
				Log.e("TCP", "S: Error", e);
			} 
			finally 
			{
				socket.close();
			}
		} 
		catch (Exception e) 
		{
			Log.e("TCP", "C: Error", e);
		}
	}
}
