package Interview_Preparation;

public class Constructor_Topic {

	
	public Constructor_Topic()
	{
		System.out.println("Constructor w/o parameters");
	}
	
	public Constructor_Topic(int i)
	{
		System.out.println("with 1 param= " +i);
	}
	
	
	public Constructor_Topic(int i, int j)
	{
		System.out.println("2 param= "+i + " " +j);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Constructor_Topic	 ct = new Constructor_Topic(); //default constructor
		
		Constructor_Topic ct1 = new Constructor_Topic(5);
		Constructor_Topic ct2= new Constructor_Topic(5,10);
	}

}