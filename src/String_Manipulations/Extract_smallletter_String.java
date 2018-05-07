package String_Manipulations;

public class Extract_smallletter_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="AaBbCcDdEe";
		
		//String str2=str.replaceAll("[abcd]", " ");
						
		for (int i=0; i<=str.length()-1; i++)
		{
        char c=str.charAt(i);		
	    boolean b=Character.isLowerCase(c);
		if (b==true)
			{
			System.out.print(c);	
			}
		/*else
		{
			char c1=str.charAt(i);
			System.out.print(c1);
		}
		*/
	}
}
}