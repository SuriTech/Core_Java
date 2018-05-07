package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Property_Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fs = new FileInputStream("D:\\SUREN\\Common\\DATA\\data.txt");
		Properties prop=new Properties();
		prop.load(fs);
		System.out.println(prop.getProperty("Name"));
		
		
		Enumeration KeyValues = prop.keys();
		while (KeyValues.hasMoreElements()) 
		{
			String key = (String) KeyValues.nextElement();
			String value = prop.getProperty(key);
			System.out.println(key + ":- " + value);

	}
		
}

}