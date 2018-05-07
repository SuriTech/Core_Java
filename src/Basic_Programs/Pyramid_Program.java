package Basic_Programs;

public class Pyramid_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5; 
int k=5; //no spaces to be left


for(int i=0; i<n; i++)
{
	for (int j=0; j<k; j++)
	{
		System.out.print(" ");
	}
	k=k-1;
	for(int j=0; j<=i; j++)
	{
		System.out.print("* ");
	}
System.out.println();
}
		
}

}