package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFile_Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader r = new FileReader("D:\\SUREN\\Common\\DATA\\data.txt");
		BufferedReader bfr= new BufferedReader(r);
		String x="";
		System.out.println(bfr.readLine());
		
		while((x=bfr.readLine())!=null)
		{
			System.out.println(x);
		}
		bfr.close();
		
	}

}
