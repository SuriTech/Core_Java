package Com.JavaBasics;

public class Car {

	
	String mod;
	int price;
	static int wheels =4;
	
	public Car(String mod, int price) // Constructor overloading
	{
		this.mod=mod;
		this.price=price;
		
	}

	
	
	public Car()
	{
		System.out.println("Car consc with no args");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Car c1= new Car();
		c1.mod="Mercs";
		c1.price=150000;
		c1.Start();
		c1.Accl();
		
		Car c2= new Car();
		c2.mod="Audi";
		c2.price=203000;
		c2.Start();
		c2.Accl();
	}

	public void Start()
	{
System.out.println(mod +"Starting");		
	}
	
	public void Accl()
	{
		System.out.println(mod +"accl");
	}
}
