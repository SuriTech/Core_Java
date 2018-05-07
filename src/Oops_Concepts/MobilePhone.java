package Oops_Concepts;

public class MobilePhone extends Phone {

	public void roamFree()
	{
		System.out.println("Mobile Roaming free");
	}
@Override
public void call()  //overriding same method overridden and implemented differently
{
	System.out.println("Mobile calling");
}

}
