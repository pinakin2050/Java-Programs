package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server2 {

	public static void main(String[] args) throws IOException {
		ServerSocket listener= new ServerSocket(4000);
		System.out.println("Server is ready to accept the input:");
		Socket ssoc = listener.accept();
		Scanner scan=new Scanner(System.in);
		InputStream is = ssoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		OutputStream os= ssoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		String temp = new String();
		for(byte i=0;i<5;i++)
		{
			System.out.println("She: "+dis.readUTF());
			System.out.print("Me:");
			temp=scan.nextLine();
			dos.writeUTF(temp);
		}
		scan.close();
		listener.close();
	}
}
