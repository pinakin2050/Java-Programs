package deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import serialization.Cricketer2;

public class LaunchCricketer2 {

	public static void main(String[] args) throws Exception {

		String f1="C:\\\\Users\\\\pinak\\\\Desktop\\\\FileIO\\Serialization1.txt";
		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cricketer2 c2= (Cricketer2)ois.readObject();
		c2.disp1();
		ois.close();
	}
}
