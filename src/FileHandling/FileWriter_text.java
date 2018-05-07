package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f =new File("D:\\temp.txt");
		f.createNewFile();
		FileWriter w = new FileWriter("D:\\temp.txt");
		BufferedWriter bfr= new BufferedWriter(w);
		bfr.write("hello here");
		bfr.newLine();
		bfr.write("Starts from newline");
		bfr.flush();
		
	bfr.close();
		
	}

}
