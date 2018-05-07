package Basic_Programs;

import java.util.Scanner;

public class Str_Rev {

	static void strrev(String str)
	{

		for (int i=str.length()-1; i>=0; i--)
		{
	   char st1=str.charAt(i);
		System.out.print(st1);
		
         		}
	}

	
	static void strnum(String str)
	{
		int value = Integer.parseInt(str.replaceAll("[^0-9]", ""));
	    System.out.println(value);
	}
	static void strlower(String str)
	{
		for (int i=str.length()-1; i>=0; i--)
		{
		 char c=str.charAt(i);
		 boolean b=Character.isLowerCase(c);
		 if (b==true)
		 {
			 //System.out.println(c);
			 
		 }
		 
		 else
		 {
			 char c1=str.charAt(i);
			 System.out.println(c1);
		 }
		}
		
	}
	static void remvowels(String str)
	{
		String nstr = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(nstr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		//strrev(str1);
		//strnum(str1);
		strlower(str1);
		//remvowels(str1);
}

}