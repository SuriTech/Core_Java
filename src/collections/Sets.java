package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> st= new HashSet<String>();
		//Set<String>st1=new HashSet<String>();
		//Set<String>st2=new TreeSet<String>();
		//Set<String>st3=new LinkedHashSet<String>();
		st.add("INDIA");
		st.add("UK");
		st.add("USA");
		st.add("INDIA");
		st.add("Dubai");
		st.add("Singapore");
		st.add("Malaysia");
		System.out.println(st);
	
        
		System.out.println(st.remove("UK"));
		System.out.println(st.contains("INDIA"));
		System.out.println(st.isEmpty());
		System.out.println(st);
	
		Iterator<String>itr= st.iterator();
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		
	}

}
