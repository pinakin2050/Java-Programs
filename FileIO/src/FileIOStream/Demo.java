package FileIOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo {

	public static void main(String[] args) throws Exception {
		String f1="C:\\\\Users\\\\pinak\\\\Desktop\\\\FileIO\\input.txt";
		String f2="C:\\\\Users\\\\pinak\\\\Desktop\\\\FileIO\\output.txt";
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		int temp;
		while((temp=fis.read())!=-1)
		{
			fos.write(temp);
		}
		fis.close();
		fos.close();
	}
}
