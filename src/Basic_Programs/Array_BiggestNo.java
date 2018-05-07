package Basic_Programs;

public class Array_BiggestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1000,205,30,1273,50,15};
		int max;
		 max=a[0];
		
		for (int i=1; i<a.length;i++)
		{
          
			if (max<a[i])
			{
			 max=a[i];
			}
			
		}
		
		System.out.println(max);
	}

}