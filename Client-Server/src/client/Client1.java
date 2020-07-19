package client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket csoc=new Socket("192.168.1.112",4000);
		OutputStream os=csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your msg:");
		String temp=scan.nextLine();
		dos.writeUTF(temp);
		scan.close();
		csoc.close();
	}

}
