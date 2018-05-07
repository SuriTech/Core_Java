package Test_Practice_Programs;

public class Rev_String {

	public static void main(String[] args) {
		
	String str="java world";
	
	for(int i=str.length()-1; i>=0; i--)
	{
		System.out.print(str.charAt(i));
	}
		
	}

}
