package Abstraction_Interface;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HDFC hd = new HDFC();
hd.credit();
hd.debit();
hd.loan();
hd.funds();
		
	
	Bank b=new HDFC();
	b.credit();
	b.debit();
	b.loan();
//b.funds(); can't be allowed because HDFC obj is referred by Bank b referrence var
	
//Bank b1= new Bank(); can't create object of Bank because it is interface
	
	}

}
