package Test_Practice_Programs;

public class String_length {

	public static void main(String[] args) {

String str = "hello world";

int token =0;
for(int i=0; i<str.length(); i++)
{
	System.out.print(str.charAt(i));
	token=token+1;
}
System.out.println("\n");
System.out.println("length of string"+token);
		
	}

}
