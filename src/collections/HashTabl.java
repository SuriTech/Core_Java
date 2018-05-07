package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTabl {
//HashTable is thread safe, Synchronized at a time one thread can only access
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> h1 = new Hashtable<Integer,String>();
		h1.put(1, "Tom");
		h1.put(2, "Ram");
		h1.put(3, "sam");
		
		//create clone
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable)h1.clone();
		System.out.println("Values are" +h1);
		System.out.println("Values are" +h2);
		
		
Hashtable st = new Hashtable();

st.put("a", "hello");
st.put("b", "world");
st.put("c", "selenium");

if (st.contains("hello"))
{
	System.out.println("found");
}

	
	Enumeration e=st.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	
	
	Set s=st.entrySet();
	
System.out.println(s);	}

}
