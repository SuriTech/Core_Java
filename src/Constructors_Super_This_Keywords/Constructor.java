package Constructors_Super_This_Keywords;

public class Constructor {
	
	public Constructor()
	{
		System.out.println("Default Constructor ");
	}

	public Constructor(int a)
	{
		System.out.println("Single parameter constructor" +a);
	}
	
	public Constructor(int i, int j)
	{
		System.out.println("Two param constructor" +i + "" +j);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Constructor c = new Constructor();
	Constructor c1 = new Constructor(2);
	Constructor c2=new Constructor(2,3);
	
	}

}
