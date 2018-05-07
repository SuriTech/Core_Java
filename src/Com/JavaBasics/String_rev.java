package Com.JavaBasics;

import java.util.Scanner;

public class String_rev {

	public static void stringrev(String st)
	{
		for(int i=st.length()-1; i>=0; i--)
		{
		
	    
	    System.out.print(st.charAt(i));
		}
	
		
	}
	
	public static void stlength(String st )
	{
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String st="SURENDRA";
		System.out.println("Please enter string");
		String str=sc.nextLine();
		
		
		int len=0;
	//	char ch1[]= new char[10];
		for( char ch: str.toCharArray())
		{
			len++;
			System.out.print(ch);
		}
		System.out.println("\n");

		System.out.println("String length is" +len);
		sc.close();
		/*
		for(int i=1; i<=len; i=i+1 )
		{
			char ch1[]=new char[10];
			ch1[i]=str.charAt(i);
			System.out.println(ch1);
		}
		*/
		String stn="The rain have started here";
		String temp[]=stn.split("have");
System.out.println(temp[1]);		

	}

}
