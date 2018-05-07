package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIle_Create {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f= new File("D:\\test123.txt");
		f.createNewFile();
		FileWriter w = new FileWriter("D:\\test1234.xlsx");
		BufferedWriter out=new BufferedWriter(w);
		out.write("hello how are you");
		out.newLine();
		out.write("This is in next line");
		out.flush();
		out.close();
		
		//*************
		
		FileReader r=new FileReader("D:\\test1234.xlsx");
BufferedReader bfr = new BufferedReader(r);		
String x="";
System.out.println(bfr.read());

while((x=bfr.readLine())!=null)
{
	System.out.println(x);
}
		
		bfr.close();
	}

}
