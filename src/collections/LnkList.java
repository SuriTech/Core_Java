package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LnkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	LinkedList<String>ll = new LinkedList<String>();
	ll.add("Test");
	ll.add("Selenium");
	ll.add("webdriver");
	ll.add("maven");
	ll.add(4,"hello");
	
// Each and every node is having reference of next element
	
	//print
	
	                          
	
	ll.addFirst("Surendra");        // To add as first element
	ll.addLast("Mandem");
	System.out.println("Contets are..." +ll);

	ll.get(0);
	ll.set(0, "Suri");
	System.out.println(ll.get(0));
	
	//ll.removeFirst();
	//ll.removeLast();
	
	
	//to print for, iterator
	/*for(int i=0; i<ll.size(); i++ )
	{
		System.out.println(ll.get(i));
	}
	*/
	//advanced for loop

	for(String al:ll)
	{
		System.out.println(al);
	}
	Iterator<String>it= ll.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}

}
