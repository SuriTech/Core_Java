package Test_Practice_Programs;

public class Reverese {

	public static void main(String[] args) {

		String input ="hello world";
        String[] words = input.split(" ");
        String reverse = "";

        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse += words[i].charAt(j);
            }
            System.out.print(reverse + " ");
            reverse = "";
        }
    }
}
