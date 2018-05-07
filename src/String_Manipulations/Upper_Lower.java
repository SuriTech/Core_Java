package String_Manipulations;

public class Upper_Lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="AaBbCc";
		String s="";
		for(int i=0; i<str.length(); i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				s=s+Character.toLowerCase(str.charAt(i));
			}
			else
			
				s=s+Character.toUpperCase(str.charAt(i));
		}
		System.out.println(s);
		}				
	}


