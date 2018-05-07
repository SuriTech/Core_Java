package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reading_Properties_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		System.out.println(System.getProperty("user.dir"));
		FileInputStream fp = new FileInputStream(System.getProperty("user.dir") + "\\src\\config\\Employee.properties");

		prop.load(fp);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.get("city"));
	}

}
