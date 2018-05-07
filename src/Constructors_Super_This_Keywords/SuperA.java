package Constructors_Super_This_Keywords;

public class SuperA {
	int rno;
	public  SuperA()
	{
		System.out.println("Parent class const");
	}
	
	public SuperA(int i, int j)
	{
		System.out.println("values of i,j is"+i +j);
	}
	public void call()
	{
		System.out.println("hello");
	}

	
	public SuperA(int i)
	{
		System.out.println("value of i "+i);
	}
}
