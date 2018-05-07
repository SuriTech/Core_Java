package String_Manipulations;

//***** Interview Question *** extract common words from two string
public class Duplicate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String string1="Testing Interview today ";

String string2="Testing Interview tomorrow today ";

		String[] temp = string1.split(" ");
		String st="";
		
		for (int j=0; j<temp.length; j++)
		{
			if (string2.contains(temp[j]))
			{
			 st=st+temp[j];
			}

		}
		 System.out.println(st);

		/*
		for(String x : temp)
		{
		if(string2.contains(x))
		System.out.println(x);
		}*/		
	}
}