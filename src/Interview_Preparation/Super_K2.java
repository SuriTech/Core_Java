package Interview_Preparation;
/*
 to use Super keyword both classes should be extended
 
 super keyword used to call parent class methods and variables from child class
 
 super and this can't be used on static methods
 
 if we are using super keyword on constructors then there should be only one super keyword
 in method and it should be at 1st line in method as super() or super(10)
 
 Constructor call must be the first statement in a constructor
 
 Two constructors calls is not allowed in method on constructors
 
 
 */

public class Super_K2 extends Super_K1 {

	public Super_K2() {
		// super();
		super(10); // two constructors calls is not allowed in method on constructors.

	}

	public void m1() {
		System.out.println("Super K2 m1() method");
	}

	public void childmethod() {
		// super(10); not allowed
		super.m1();
		super.m2();
		this.m1();
		System.out.println("Child method");
	}

	public void m2() {
		System.out.println("Super K2 m2() method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super_K2 k2 = new Super_K2();
		k2.childmethod();

	}

}