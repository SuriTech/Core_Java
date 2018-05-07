package Oops_Concepts;

public class Temp {

	void m1()
	{
		System.out.println("hi");
	}
	
	Temp()
	{
		System.out.println("Obj created");
	
	}
	
	Temp(int b)
	{
		System.out.println(b);
	}

public static void main(String args[])
{
	Temp o=new Temp();
	Temp o1=new Temp(30);
	o.m1();
	o1.m1();
}
}