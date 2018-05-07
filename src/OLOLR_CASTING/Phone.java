package OLOLR_CASTING;

public class Phone extends SmartPhone {

	public void call()
	{
		System.out.println("Calling ... phone");
	}
	
	
	public void modem()
	{
		System.out.println("Modem line phone");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p = new Phone(); //1. child class ref = child class obj
		p.call();
		p.Data();
		p.sms();
		p.modem();
		
		SmartPhone sp = new SmartPhone(); // 2. parent class ref = parent class obj
		sp.call();
		sp.sms();
		sp.Data();
		
		
		System.out.println("**********");
		SmartPhone smp= new Phone(); // 3. TOP CASTING parent class ref= child class obj
		smp.call();
		smp.sms();
		smp.Data();
		//smp.modem();// Not allowed modem is feature of Phone can't access just by creating parent class ref
		
		Phone ph=(Phone) new SmartPhone();// 4. DOWN CASTING - Child class ref= Parent class object
		ph.call();                        //But it throws class cast exception error
		ph.modem();
		
		
	}

}