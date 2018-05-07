package Com.JavaBasics;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hospital ha = new Hospital();
		
		FortisHospital f= new FortisHospital();
		f.operate();
		f.doScan();
		f.doVaccination();
		f.phoneConsultation();
		
		
		GovtHospital g= new GovtHospital();
		g.operate();
		g.doScan();
		g.doScan();
		
		
		//interface ref = new class which implemeting that interfrace
		Hospital h = new FortisHospital();
		h.operate();
		h.doScan();
		h.doVaccination();
		
		//h.phoneConsultation(); error shows here bcz
		
/* you can only access methods which is coming from Hospital interface 
phone consultation() method is not there in Hospital interface
reference h points towards FortisHospital mehtods which are coming from Hospital 
*/
		
	Hospital h1=new GovtHospital();
	
	h1= new FortisHospital();
	Hospital x=null;
	
	x=new GovtHospital();
	x.doScan();
	
	x=new FortisHospital();
	x.doScan();
		
	}

}
