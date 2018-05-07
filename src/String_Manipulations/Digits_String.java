package String_Manipulations;

public class Digits_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="fjakfjafkj123kljsf3";

String str2=str.replaceAll("[^0-9]", "");
System.out.println(str2);
//or
int digits=Integer.parseInt(str.replaceAll("[^0-9]", ""));
System.out.println(digits);

}
}