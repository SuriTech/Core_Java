package Basic_Programs;
public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=121;
		int temp=0; int k, l;
		l=n;
		while(n>0)
		{
		k=n%10;
		temp=temp*10+k;
		n=n/10;
	
		}
	
		if (temp==l)
				{
			System.out.println("palindrome no");
				}
		else
		{
		System.out.println("Not palindrome");
		}
	}
}