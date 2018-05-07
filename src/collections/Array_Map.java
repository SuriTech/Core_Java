package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Array_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al= new ArrayList<String>();
al.add("hello");
al.add("hello");
al.add("selenium");
al.add("webdriver");

int siz=al.size();

ArrayList<String> al1= new ArrayList<String>();
al1.add("java");
al1.add("Ruby");
al1.add("python");
al1.add("PHP");

int siz1=al.size();


Map<String,String> mp = new HashMap<String,String>();
for(int i=0; i<siz; i++)
{
mp.put(al.get(i), al1.get(i));	
}
System.out.println(mp);

		
		
	}

}
