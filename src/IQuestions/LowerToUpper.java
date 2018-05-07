package IQuestions;
//******** Imp interview Question
import java.io.IOException;

public class LowerToUpper {
    static String myString;
    static int length;
static String newString="";
    public static void main(String args[]) throws IOException {

        myString = "ToMaTo";
        length = myString.length();
        changeCase();
    }
public static void changeCase() {
	for(int i=0; i<length; i++)
	{
if (Character.isUpperCase(myString.charAt(i)))
{
	newString=newString+Character.toLowerCase(myString.charAt(i));
}
else
	newString=newString+Character.toUpperCase(myString.charAt(i));

}
System.out.println(newString);
}
}
  /*  public static void changeCase() {
        char c;
        String finalString = "";
        for (int i = 0; i < length; i++) {
            c = myString.charAt(i);

            if (c >= 65 && c <= 90)
                finalString += (char) (c + 32);
            else if (c >= 97 && c <= 122)
                finalString += (char) (c - 32);
            else
                finalString += c;


        }
        System.out.println("\n Original : " + myString);
        System.out.println("Changed : " + finalString);
    }
*/

