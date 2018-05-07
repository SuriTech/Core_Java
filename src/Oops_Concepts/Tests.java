package Oops_Concepts;

public class Tests {
	
	int a=6; static int b=6;
	
	void m1()
	{
		a++;
		b++;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tests temp = new Tests();
		temp=new Tests();
		System.out.println(b);
		System.out.println(temp.a);
		temp.m1();
		System.out.println(b);
		System.out.println(temp.a);
		
		Tests t = new Tests();
		System.out.println(t.a);
		System.out.println(t.b);
	}

}
