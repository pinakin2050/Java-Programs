package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class LaunchDemoExternalizable {

	public static void main(String[] args) throws Exception {
		String f1="C:\\\\Users\\\\pinak\\\\Desktop\\\\FileIO\\Serialization1.txt";
		FileOutputStream fos=new FileOutputStream(f1);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		DemoExternalizable d = new DemoExternalizable("Dravid",105,17000,3,45.7f);
		d.disp2();
		oos.writeObject(d);
		oos.close();
	}
}
