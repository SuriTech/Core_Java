package Com.JavaBasics;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//one dimensional array
		int a[]=new int [3];
		int [] b = new int [4];
		
		String x[][]= new String [2][3];
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		x[0][0]="A1"; x[0][1]="A2"; x[0][2]="A3";
		
		x[1][0]="B1"; x[1][1]="B2"; x[1][2]="B3";
		
		for(int k=0; k<x.length; k++)
		{
			for(int m=0; m<x[0].length;m++)
			{
				System.out.print(x[k][m]);
				System.out.println("");
			}
		}
		
		
		
		
		
		
		
		
		
		int c[]= {2,3,2};
		a[0]=1; a[1]=1; a[2]=3;
		
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
		
		Object o[]= new Object[5];
		
		o[0]=13;
		o[1]="test";
		o[2]=123.23;
		o[3]="12-20-82";
		o[4]=true;
		
		
		
		
		/*int [] i = new int[2];
		int z[]= new int[2];
		z[1]=0;
		i[1]=2;
		
		System.out.println(i[1]);
				
		int k=5;
		int l=10;
		
		int m=++k * l--;
	 System.out.println(m);
	 */
	}

}
