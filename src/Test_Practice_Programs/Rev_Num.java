package Test_Practice_Programs;

public class Rev_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=125;
int rev=0;
int rem;

while(n>0)
{
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
}
System.out.println(+rev);
		
	}

}
