package Constructors_Super_This_Keywords;

public class SuperB extends SuperA {

	
	public  SuperB()
	{
		//super.call();
		super(10,20);

		//super(10);
		System.out.println("child class cosntr");

	}
	
	public SuperB(int i)
	{
		super(10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	SuperB sb = new SuperB(); 
	SuperB sb1=new SuperB(10);
	}

}
