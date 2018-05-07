package Methodoverloading_Overriding_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Runtime Polymarphism or *****Dynamic Polymarphism**

		BMW b = new BMW(); //1.
		b.start();
		b.stop();
		b.refill();
		b.theftsafety();
		b.engine();

		System.out.println("================");

		Car c = new Car(); //2.
		c.start();
		c.stop();
		c.refill();
		c.engine();

		System.out.println("================");

		Car c1 = new BMW(); //3.
		// Parent class ref variable child class object
		// child class object can be referred by parent class reference variable
		// ********** TOP CASTIMG ********************************************
		c1.start();
		c1.stop();
		c1.refill();

		c1.engine();

		// c1.theftsafety(); ** can't be accessed because its own feature of BMW and can't access just by creating ref
		System.out.println(" **************");
		// ************ Down Casting ******************
		// child class ref = Parent class object
		// BMW b1 = new Car() ******** Not allowed ***** so cast it as below
		
		BMW b1 = (BMW) new Car(); //4. *** but it generates exception class cast exception**
		b1.start();
		b1.stop();
		b1.refill();
		b1.theftsafety();
		b1.engine();

	}
}