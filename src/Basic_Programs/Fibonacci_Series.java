package Basic_Programs;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=5; int n1=0; int n2=1; int n3;
   
   for(int i=0; i<n; i++)
   {
	   System.out.println(n1);
	   n3=n1+n2;
	   n1=n2;
       n2=n3;
} 
	}
}