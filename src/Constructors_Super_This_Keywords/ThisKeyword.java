package Constructors_Super_This_Keywords;

public class ThisKeyword {
//global variables, instance variable	
String name;
int age;
	
	public ThisKeyword(String name, int age)
	{
		//name=name; //local var = local var
		//age=age;
		
		this.name=name; //global var = local var
		this.age=age;
		//System.out.println(name);
		//System.out.println(age);
	}
	
	public void display()
	{
		System.out.println(name); // displays null, 0 if assign name =name, age =age
		System.out.println(age);
	}
	
	public void m1()
	{
		System.out.println("m1 method form this keyword class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword k = new ThisKeyword("Peter", 23);
		k.display();
		
	}

}
