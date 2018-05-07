package String_Manipulations;

import java.util.Scanner;

public class String_Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Please enter one string");
		
String str=sc.nextLine();

int siz=0;


for (int j=0; j<str.length(); j++)
{
char c=str.charAt(j);
siz=siz+1;
}
System.out.println(siz);
/*
for(char ch: str.toCharArray())
{
	siz=siz+1;
	
	System.out.println(ch);
}*/
System.out.println("Length of string"+siz);
	}

}