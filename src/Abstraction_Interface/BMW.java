package Abstraction_Interface;

public class BMW implements Car{

	@Override
	public void strart() {
		// TODO Auto-generated method stub
		System.out.println("BMW ----- start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW ----- stop");
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		System.out.println("BMW ---- refill");
	}
	// non overridden - my own method
	public void theftsafety()
	{
		System.out.println("BMW ----- theft safety");
	}

}
