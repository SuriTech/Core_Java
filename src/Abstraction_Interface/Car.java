package Abstraction_Interface;

public interface Car {

// no need to write abstract keyword before method name by nature all methods are abstract 
// no method body only declaration
// Always declare only abstract method in Inheritance
// We achieve 100 % abstraction
//we can't create object of interface

// we can define only final and static variable
	
	
 int wheels=4;	// by default it treated as final and static
	
public void  strart(); 
public void stop();
public void refill();

}
