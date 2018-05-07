package String_Manipulations;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Strings_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SortedSet<String> set = new TreeSet<String>();

	      String[] s= {"this", "will", "be", "sorted", "without", "any", "sort()", "function", "or", "comparator"};

          Set<String>set=new TreeSet<String>();

	      // Add elements to the set

	      for(int i=0; i<s.length; i++)

	      {

	    	  set.add(s[i]);

	      }

	      

	      // Iterating over the elements in the set

	      Iterator<String> it = set.iterator();

	      while (it.hasNext()) {

	         // Get element

	        String element = it.next();
             
	         System.out.println(element.toString());

	      // objecct element; syso(element.toString())
	      }

		
	}

}
