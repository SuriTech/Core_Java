package Interview_Preparation;

public class Movload {
String s1;
	
	void method1()
	{
		System.out.println("Hello");
	}
	
	int method1(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	void method1(String s)
	{
	s1=s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Movload mv = new Movload();
		
		mv.method1();
		int k =mv.method1(1, 5);
		System.out.println(k);
		
		
		 mv.method1("load");
		
         System.out.println(mv.s1); 		
	}

}