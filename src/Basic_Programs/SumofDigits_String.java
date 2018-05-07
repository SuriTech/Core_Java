package Basic_Programs;

public class SumofDigits_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abc23e5";
		int sum=0;
		for(int i=0; i<str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum=sum+Character.getNumericValue(str.charAt(i));
				//sum=sum+str.charAt(i)-'0';
			}
		}
	System.out.println(sum);
	}

}