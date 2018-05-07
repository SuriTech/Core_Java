package Oops_Concepts;

public class TestPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MobilePhone m=new MobilePhone();
		SmartPhone sp=new SmartPhone();
		
		Phone p=new Phone();
		p.call();
		p.voiceMail();
		System.out.println("------------");
		m.call();
		m.roamFree();
		m.voiceMail();
		
		sp.call();
		sp.apps();
		sp.roamFree();
		sp.voiceMail();

	}

}
