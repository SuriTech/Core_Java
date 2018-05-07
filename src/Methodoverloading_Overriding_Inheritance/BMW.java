package Methodoverloading_Overriding_Inheritance;

public class BMW extends Car  {  // has....a relationship

// when same method present in child and parent class with same name and same no of args is called method overriding	
	
public void start()  //overridden method;  when same method present in parent also but compiler will take child method
{
	System.out.println("BMW ..... starts");
}
	
public void theftsafety()

{
	System.out.println("BMW Theft safety");
}

}