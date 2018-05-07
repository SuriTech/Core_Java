package IQuestions;

public class String_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str[]= {"a","1", "hel", "2.3", "3"};

String str1[]=str;
  for(int i=0; i<=str1.length-1; i++)
  {
	  String s1=str1[i];
	  
	  if (isInteger(s1))
	  {
		  System.out.println(s1);
	  }
	  else
	  {
		  System.out.println("not string");
	  }
  }
	}
	
public static boolean isInteger(String s1)
{
  try{
	  Integer.parseInt(s1);
      return true;
  }
  catch (Exception e)
  {
	 return false;
}	
}
}