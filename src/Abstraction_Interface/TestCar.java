package Abstraction_Interface;

public class TestCar {

	public static void main(String args[])
	{
		BMW b = new BMW();
		b.strart();
		b.stop();
		b.refill();
		b.theftsafety();
	
		
		 Car c=new BMW();//child class 
		 c.stop();
		 c.strart();
		 c.refill();
		 
		 
	}
}
