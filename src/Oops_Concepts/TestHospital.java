package Oops_Concepts;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Hospital h= new Hospital(); ** we can not create object of interface**
		
		CMCHospital cm=new CMCHospital();
		cm.operate();
		cm.doScan();
		cm.doVaccination();
		cm.phoneConsulation();
		
		GovtHospital gv=new GovtHospital();
		gv.operate();
		gv.doScan();
		gv.doVaccination();
	
		//interface ref= new class which is imlementing that interface
		Hospital h=new CMCHospital(); //ref of Hospital interface is point towards CMCHospital
		h.doScan();
		h.operate();
		h.doVaccination();
		
		//h.phoneConsulation  **this is not coming from Hospital interface so gives error
		//-----------------------------
		System.out.println("********************");
		
		Hospital h1=new GovtHospital();
		Hospital x=null;
		x=new CMCHospital();
		x.operate();
		x=new GovtHospital();
		x.operate();
		
		
	}

}