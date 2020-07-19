package FileReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class PrintContentToFileAndDisplay {

	public static void main(String[] args) throws Exception {
		String f1="C:\\\\Users\\\\pinak\\\\Desktop\\\\FileIO\\input.txt";
		String f2="C:\\\\Users\\\\pinak\\\\Desktop\\\\FileIO\\output.txt";
		
		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String temp="";
		while((temp=br.readLine())!=null)
		{
			bw.write(temp);
			System.out.println(temp);
		}
		
		br.close();
		fr.close();
		bw.close();
		fw.close();
	}

}
