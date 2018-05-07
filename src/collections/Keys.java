package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> m=new Hashtable<Integer, String>();
		
		m.put(0, "Surendra");
		m.put(1, "Mrunali");
		m.put(2, "Panvel");
		m.put(3, "Mumbai");
		m.put(4, "");
		m.put(4, "");
		
		System.out.println(m.get(45));
		System.out.println(m.get(0));
		
		for(Map.Entry<Integer,String> ent: m.entrySet())
{
	System.out.println(+ent.getKey() +" "+ent.getValue());
	//System.out.println(ent.getValue());
}
	}

}
