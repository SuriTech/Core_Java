package IQuestions;

public class TypeCast {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		A1 a = new B1();
	   // B1 b = new A1();	// not allowed with parent class
	  //B1 b =a;
		B1 b= (B1) new A1();// type casting to B1 object
		B1 b1=(B1) a;
		
		//WebDriver driver = new FirefoxDriver();
		//FirefoxDriver d= driver // not allowed
		//FirefoxDriver d = (FirefoxDriver) driver;// type casted
	}

}

class A1{
	
}

class B1 extends A1{
}
