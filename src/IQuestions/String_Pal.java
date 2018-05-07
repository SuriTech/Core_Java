package IQuestions;
public class String_Pal {

	public static void main(String[] p) {
		// TODO Auto-generated method stub
		
String str="ALA";
String rev="";

for(int i=str.length()-1; i>=0; i--)
{
	rev=rev+str.charAt(i);
}

if (str.equals(rev))
	System.out.println("Palindrome");

else
System.out.println("Not palindrome");

}		
}