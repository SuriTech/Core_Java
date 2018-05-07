package Basic_Programs;

public class ArmStrong_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//153 = 1*1*1 + 5*5*5 + 3*3*3 ;
	int n=153; int temp; int arm=0; int num=n;
	
	while(n>0)
	{
		temp=n%10;
		n=n/10;
		arm=arm+temp*temp*temp;
	}
	
	if (arm == num)
			{
		System.out.println("Armstrong no");
			}
	else
	{
		System.out.println("Not Armstrong number");
	}
	
		
	}
}