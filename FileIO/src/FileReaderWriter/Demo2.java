package FileReaderWriter;

import java.io.FileReader;
import java.io.FileWriter;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		String f1="C:\\\\Users\\\\pinak\\\\Desktop\\\\FileIO\\input.txt";
		String f2="C:\\\\Users\\\\pinak\\\\Desktop\\\\FileIO\\output.txt";
		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2);
		int temp=0;
		while((temp=fr.read())!=-1)
		{
			fw.write(temp);
		}
		fw.flush();
		fr.close();
		fw.close();
	}
}
