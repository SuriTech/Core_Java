package Com.JavaBasics;

public class FortisHospital implements Hospital {

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		
	System.out.println("Fortis operating");
	}

	@Override
	public void doScan() {
		// TODO Auto-generated method stub
		System.out.println("Fortis scanning");

	}

	@Override
	public void doVaccination() {
		// TODO Auto-generated method stub
		System.out.println("Fortis vaccination");

	}

	public void phoneConsultation()
	{
		System.out.println("Phone consultation");
	}
}
