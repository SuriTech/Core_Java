package Basic_Programs;

public class Array_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {5,4,2,3,10,6};
		int temp=0;
		
//System.out.println(a.length);		


for (int i=0; i<a.length; i++)
{
	for (int j=i+1;j<a.length; j++)
	{

		if (a[i]>a[j])
		{
		temp=a[i];	
		a[i]=a[j];
		a[j]=temp;
		}
	}
}

for (int k=0; k<a.length; k++)
{
	System.out.println(a[k]);
}

}

}