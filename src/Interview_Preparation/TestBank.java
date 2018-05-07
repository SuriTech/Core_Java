package Interview_Preparation;

public class TestBank  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(USBank.minbal);
		//USBank.minbal=200; you can't change value of interface var 
		
		
		HSBCBank hs = new HSBCBank();
	
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationloan();
		hs.carloan();
		
		
		
//dynamic poly - child class objects can be referred by parent interface var
		
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
	
		
	}

}
