package server;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) throws Exception {
		ServerSocket listener=new ServerSocket(4000);
		System.out.println("SERVER IS READY TO ACCEPT INPUT.");
		Socket ssoc=listener.accept();
		InputStream is=ssoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		System.out.println(dis.readUTF());
		listener.close();
	}

}
