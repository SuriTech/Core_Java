package Basic_Programs;

public class RevWord_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    String str="check rev one String";
    String [] words=str.split(" ");
    String revstring="";
    
    for(int i=0; i<words.length; i++)
    {
    	String word=words[i];
    	String revword="";
    	
    	for(int j=word.length()-1; j>=0; j--)
    	{
    	revword=revword+word.charAt(j);
    }
    
revstring=revstring+revword+" ";
	}
    System.out.println(revstring);
	}
}