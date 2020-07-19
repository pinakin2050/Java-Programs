package deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LaunchDemoExternalizable {

	public static void main(String[] args) throws Exception {
		
		String f1="C:\\\\Users\\\\pinak\\\\Desktop\\\\FileIO\\Serialization1.txt";
		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		DemoExternalizable d1 = (DemoExternalizable) ois.readObject();
		d1.disp2();
	}
}
