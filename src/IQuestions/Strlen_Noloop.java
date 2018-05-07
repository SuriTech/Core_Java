package IQuestions;
// To print each character without using for loop
import java.util.Scanner;

public class Strlen_Noloop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter one string");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int i=0;
		strlen(0,str);
		
	}
	
	public static void strlen(int i, String str)
	{
		String cont=str;
		if(i==str.length())
		{
			System.exit(0);
		}
		else
		{
		System.out.println(cont.charAt(i));
		i++;
		}
       strlen(i,str);
}
}