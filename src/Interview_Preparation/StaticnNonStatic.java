package Interview_Preparation;

public class StaticnNonStatic {

	String name = "Peter";
	static int age = 20;

	public void sendMail() // non static method
	{
		System.out.println("sending mail method");
	}

	public static void sum() // static method
	{
		System.out.println("Sum method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(); // calling static method
		StaticnNonStatic.sum();// calling through classname.static method

		System.out.println(age); // calling static variables
		System.out.println(StaticnNonStatic.age);

		StaticnNonStatic st = new StaticnNonStatic();
		st.sendMail();
        System.out.println(st.name);
        
        
        st.sum(); //can we access static method with object, yes but warning show to access in static way
	}

}
