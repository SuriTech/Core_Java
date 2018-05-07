package Basic_Programs;

public class SecondLargest_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={10,5,4,3,2,32,55,19};
int large=a[0];
int slarge=a[0];

for(int i=0; i<a.length; i++)
{
	if (a[i]>large)
	{
		slarge=large;
		large=a[i];
	}
	else
		if (a[i]>slarge)
		{
			slarge=a[i];
		}	
}
System.out.println(slarge);
	}
}