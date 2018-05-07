package Interview_Preparation;

public interface USBank {

	
	//only method declaration
	//no method body - only method prototype
	//In interface we can declare variables, vars are by default static in nature
	//var value will not be changed, constant and final in nature
	//no static method in interface
	//no main method
	//abstract in nature - we can't create object of interface
	//Interface is abstract in nature
	
	
	int minbal =100;
	
	public abstract void credit();
	public abstract void debit();
	public abstract void transferMoney();
	
	
}
