package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class List_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lst1= new ArrayList<String>();
		lst1.add("sfsf23");
		lst1.add("hello");
		lst1.get(0);
		
		List<String> lst= new ArrayList<String>(); 
		/*lst.add(0,"selg");
		lst.add(1, "2");
		lst.add(2, "234.0");
		*/
		lst.add("sdff");
		lst.add("sdfsf");
		lst.set(1, "updated");
		
		lst.addAll(lst1);
		int z=lst.size();
		
		System.out.println(z);
		
		System.out.println(lst);
		String s=lst.get(1);
		System.out.println(s);
		
		for (String all: lst)
		{
			System.out.println(all);
		}
		
		Iterator <String> itr = lst.listIterator(); 
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	
	
		Map<Integer, String> mapHttpErrors = new HashMap<>();
		
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		
		Set p=mapHttpErrors.keySet();
		System.out.println(p);
		//System.out.println(mapHttpErrors);
	
		
	}

}
