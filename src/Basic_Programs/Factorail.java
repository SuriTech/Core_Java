package Basic_Programs;

public class Factorail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		
		int fact=1;
		
		for (int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
	System.out.println(fact);
	
//With While Loop	
	int n1=1;
	while(n>0)
	{
		n1=n1*n;
		n--;
	}
	System.out.println(n1);
	}
	
	

}
