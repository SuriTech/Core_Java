package String_Manipulations;

public class String_Rev_Each_Word {

public static void main(String[] args) {

String str="Selenium with java";
String words[]=str.split(" ");
String revstring="";


for(int i=0; i<words.length; i++)
{
String word=words[i];
String revword="";

for (int j=word.length()-1; j>=0; j--)	
{

revword=revword+word.charAt(j);	
}
revstring=revstring+revword+" ";
}
System.out.println(revstring);
}
}