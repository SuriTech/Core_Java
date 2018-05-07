package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(0, "Surendra");
		hm.put(1, "Mandem");
		hm.put(2, "QTP");
		hm.put(3, "Selenium");
		System.out.println(hm.get(0));
		
		//hm.remove(2);
		
		for (Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
	/*
		for(Entry<Integer, String> ent: hm.entrySet())
		{
		System.out.println(ent.getKey());
		System.out.println(ent.getValue());
		}
		*/
		System.out.println(hm);
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1= new Employee("suri", 23, "mec");
		
		Employee e2= new Employee("surendra", 23, "cs");
		
		Employee e3 = new Employee("sam", 12, "sfs");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		//traverse hashmap
		
		for (Entry<Integer, Employee> m: emp.entrySet())
		{
			//System.out.println(m.getKey() +" "+ m.getValue());
			
			int key= m.getKey();
			Employee e = m.getValue();
			
			System.out.println(key +" emp info");
			System.out.println(e.name + e.age +e.dept);
		}
	}

}
