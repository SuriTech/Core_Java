package Oops_Concepts;

public class CMCHospital implements Hospital{

	@Override
	public void operate() {
		// TODO Auto-generated method stub

		System.out.println("CMC operating");
	}

	@Override
	public void doScan() {
		// TODO Auto-generated method stub
		System.out.println("CMC scanning");
	}

	@Override
	public void doVaccination() {
		// TODO Auto-generated method stub
		System.out.println("CMC vaccinating");
	}

	public void phoneConsulation()
	{
	System.out.println("Phone consultation");	
	}
}
