package Test_Practice_Programs;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"123", "234", "234"};
		//int intarr[] = null;
	    Integer[] intarray=new Integer[arr.length];

		
		for (int i=0; i<arr.length; i++)
		{
	     intarray[i]=Integer.parseInt(arr[i]); //Exception in this line		
		}
				
		for (Integer a: intarray) {
			System.out.println(a);
		}
}
}