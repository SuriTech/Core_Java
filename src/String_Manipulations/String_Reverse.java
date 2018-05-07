package String_Manipulations;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hello";

String rev="";

for (int i=str.length()-1; i>=0; i--)
{
	char ch=str.charAt(i);
	System.out.print(ch);
}
	
}

}
