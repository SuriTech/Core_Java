package Basic_Programs;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "rama";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--)

			reverse = reverse + str.charAt(i);
		// boolean b;
		if ((str.equals(reverse))) {
			System.out.println("String is palindrome");
		} else
			System.out.println("Not palindrome");

	}

}
