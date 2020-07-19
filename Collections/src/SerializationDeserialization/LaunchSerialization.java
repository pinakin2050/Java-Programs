package SerializationDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class LaunchSerialization {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\pinak\\Desktop\\serialization.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Serialization s=new Serialization("Dravid",10000,78.98f);
		s.display();
		oos.writeObject(s);
	}
}
