package Basic_Programs;

public class SumofDigits_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=125;
    int temp;
    int sum=0;
    
    while(n>0)
    {
    temp=n%10;
    sum=sum+temp;
    n=n/10;
    
    }
    System.out.println(sum);
		
	}
}