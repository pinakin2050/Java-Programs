package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class LaunchCricketer2 {

	public static void main(String[] args) throws Exception {
		Cricketer2 c2= new Cricketer2("Dhoni",200,15000,7,56.7f);
		c2.disp1();
		String f1="C:\\\\Users\\\\pinak\\\\Desktop\\\\FileIO\\Serialization1.txt";
		
		FileOutputStream fos = new FileOutputStream(f1);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c2);
		oos.close();

	}
}
