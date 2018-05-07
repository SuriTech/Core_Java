package Constructors_Super_This_Keywords;

public class ThisKeyword2 extends ThisKeyword1{

	public void m1()
	{
	System.out.println("m1 method from const 2");
	}
	
	public void call()
	{
	 this.m1();
	 System.out.println("End of fun");
	 super.m1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword2 k2 = new ThisKeyword2();
		k2.call();		
			
				
		
	}

}
