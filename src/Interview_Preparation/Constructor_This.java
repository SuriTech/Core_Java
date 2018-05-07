package Interview_Preparation;

public class Constructor_This {
	
	String name;
	int rno;
	

	public Constructor_This(String name, int rno) //this refers current class method names and variables
	{
		this.name=name;   //to initialize global variable with local variable value
		this.rno=rno;
		//name=this.name;
		//rno=this.rno;
		System.out.println(name);
		System.out.println(rno);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor_This ct = new Constructor_This("Suri", 20);
System.out.println(ct.name);		

System.out.println(ct.rno);
		
	}

}
