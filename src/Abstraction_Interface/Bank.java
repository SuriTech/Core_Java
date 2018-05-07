package Abstraction_Interface;

public abstract class Bank { //abstarct class is class which has at least one abstr method

//Partial abstraction
//Hiding implementation logic called abstraction
//we can't create object of abstract class
	
int amt=100;	
final int rate=10;	
static int loanrate=5;
	
public abstract void loan();  //abstract method

public void credit()
{
	System.out.println("Bank... credit");
}
	
public void debit()
{
	System.out.println("Bank.. debit");
}
	
}