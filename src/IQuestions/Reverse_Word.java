package IQuestions;

public class Reverse_Word {

	public static void main(String args[]) {
		
  	
	String str="hello world";
	//revword(str);
	revsword(str);
}
public static void revsword(String str)
{
	String[]words = str.split(" ");
	String revstr="";

	for(int i=0; i<words.length; i++)
	{
	String word=words[i];
	String revword="";
		
		for(int j=word.length()-1; j>=0; j-- )
		{
		revword=revword+word.charAt(j);
		}
	revstr=revstr+revword+" ";
	}
	
System.out.println(revstr);
}
	
	
	
public static void revword(String str)
{

	for (String cut: str.split(" "))
	{
		StringBuffer bf=new StringBuffer(cut);
		System.out.print(bf.reverse().toString());
	    System.out.print(" ");
	}
	
}
}