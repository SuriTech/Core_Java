package Basic_Programs;

import java.util.Scanner;
public class Num_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		int rev=0;
		
		/*while(n!=0)  //45
		{
		 rev=rev*10; //50
		 rev=rev+ n%10; //5, 50+0
		 n=n/10; //0.5
		}
		  */
		
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
	System.out.println(rev);			
	}
}