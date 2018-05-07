package Test_Practice_Programs;

public class Phone
extends Mobile {
	
	public void call()
	{
		System.out.println("Phone call");
	}

	public void std()
	{
		System.out.println("phone std");
	}
	
	public void fixed()
	{
		System.out.println("fixed phone");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p= new Phone();
		p.call();
		p.std();
		p.net();
		p.gps();
	    p.fixed();
	    
Mobile m = new Phone();
m.call();
m.std();
m.net();
m.gps();



Mobile m1 = new Mobile();
m1.call();
m1.std();
m1.net();
m1.gps();

//Phone p2 = (Phone) new Mobile();

	}

}