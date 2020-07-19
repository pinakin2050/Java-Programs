package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket csoc=new Socket("192.168.1.112",4000);
		OutputStream os = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		InputStream is = csoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		String temp=new String();
		Scanner scan = new Scanner(System.in);
		for(byte i=0;i<5;i++)
		{
			System.out.print("Me: ");
			temp=scan.nextLine();
			dos.writeUTF(temp);
			System.out.println("She: "+dis.readUTF());
		}
		scan.close();
		csoc.close();
	}

}
