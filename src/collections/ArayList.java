package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[]=new int[3];
		
ArrayList<Integer> arr= new ArrayList<Integer>();

ArrayList<Integer> lt1= new ArrayList<Integer>();

arr.add(10);                     //** 1. To add elements in list
arr.add(5);
arr.add(20);
arr.add(25);

arr.add(123);

int index=arr.get(0);
System.out.println(index);      //** 2. To get the value from specific index

System.out.println(arr.size()); //** 3. To print the size of list

if (arr.isEmpty())              //** 4. To check list is empty or not
{
	System.out.println("no elements");
}
else
{
	System.out.println("no of elements are "+arr.size());
}

//arr.remove(2);                //** 5. To remove element from list

//arr.removeAll(arr);           //** 6. To remove all elements in list

arr.addAll(lt1);                //** 7. To copy one elements of list to other list

arr.set(2, 1001);               //** 8. To update element with new element value

if (arr.contains(1001))         //** 9. To search element in list
{
	System.out.println("Presnet in list");
}

System.out.println(arr.retainAll(lt1));             //** 10. To get common values from both list

/* ************************* To Print elements in List *************************   */

for (Integer all:arr)              // Using advanced for loop or for each loop
{
	System.out.println(all);
}

for(int i=0; i<arr.size(); i++)   // Using for loop
{
	System.out.println(arr.get(i));
	
}

Iterator<Integer>it1= arr.listIterator();
System.out.println("List values using itertor is ***");
while(it1.hasNext())
{	
	System.out.println(it1.next());
}


//Employee class objects

		Employee e1 = new Employee("suren",37,"CS");
		Employee e2= new Employee("ram", 34, "MEC");
		Employee e3 = new Employee("suresh", 22, "ITS");
		
	// create array list
		
		ArrayList<Employee> ar3=new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
	
	//iterator to traverse the values
	Iterator<Employee> it= ar3.iterator();
	while(it.hasNext())
	{
		Employee emp= it.next();
		
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		
	}
			
	}

}