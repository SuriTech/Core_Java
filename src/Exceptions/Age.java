package Exceptions;

public class Age {
	
	static void ageval(int ag)
	{
		
		if (ag<18)
		{
			throw new ArithmeticException ("not valid");
		}
		
		else
		{
			System.out.println("Welcome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ageval(10);
		System.out.println("Rest of the code");
		
	}

}
