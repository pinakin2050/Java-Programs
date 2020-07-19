package BufferedReaderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Demo3 {

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
		}
		bw.close();//bw.flush();
		br.close();
		fw.close();// fw.flush();
	}
}
