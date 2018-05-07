package Interview_Preparation;

public class HSBCBank implements USBank, BrazilBank {

	//if class implementing any interface its mandatory to define all methods of interface
	// we are achieving multiple inheritance *** is-a relationship
	
	public void credit() {
		System.err.println("HSBC Credit");
	}

	public void debit() {

		System.out.println("HSBC debit");

	}

	public void transferMoney() {
		System.out.println("HSBC transfer money");
	}

	//separate method of HSBC bank its own method
	public void educationloan()
	{
		System.out.println("HSBC education loan");
	}
    //separate method HSBC Bank bank
    public void carloan()
    {
    	System.out.println("HSBC car loan");
    }

	//override from Brazil bank
	public void mutualfund() {
System.out.println("Brazil bank mutual funds");		
	}

}