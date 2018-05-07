package Test_Practice_Programs;

public class Rev_word_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str="hello word";
	String[]words=str.split(" ");
	String revstring="";
	
	for (int i=0; i<words.length; i++)
	{
	 String st=words[i];
	 String revword="";
	 for (int j=st.length()-1; j>=0; j--)
	 {
		 revword=revword+st.charAt(j);
		 //System.out.println();
	 }
		revstring=revstring+revword+ " ";
	}
	
	System.out.println(revstring);
	
	}

}
