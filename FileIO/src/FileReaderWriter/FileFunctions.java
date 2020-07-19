package FileReaderWriter;

import java.io.File;

public class FileFunctions {

	public static void main(String[] args) {
		String f1="C:\\\\Users\\\\pinak\\\\Desktop\\\\FileIO\\input.txt";
		File f=new File(f1);
		
		if(f.exists()==true)
		{
			if(f.isFile())
				System.out.println("It's a file");
			else
				System.out.println("It's a folder");
		}
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.isDirectory());
		System.out.println(f.getParent());
	}

}
