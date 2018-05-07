package Com.JavaBasics;

public class MobilePhone extends Phone {

	public void roamFree()
	{
		System.out.println("mobile roaming");
	}
	
	//overriding
	
	@Override //annotation
	public void call()
	{
	System.out.println("Mobile callilng");	
	}
	
}
