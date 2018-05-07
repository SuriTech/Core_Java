package Com.JavaBasics;

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car a = new Car();
		Car b = new Car();
	    Car c= new Car();
	a.mod="xxxx";
	a.price=23424234;
	
	
	Car d = new Car("Hyundai", 134234);
	System.out.println(d.mod);
	System.out.println(d.price);
	
	Car e= new Car("sdfsf", 2342424);
	}

}
