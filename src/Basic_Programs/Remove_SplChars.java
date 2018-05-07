package Basic_Programs;

public class Remove_SplChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="&(*&abc#$^%def@#$%^*&^*&^@17234&^*&^*#&^@ewrwrwr234!@#wse";
		//String s2=str.replaceAll("&(*&#$^%", "");
		//String s2=str.replaceAll("\\W+","");
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

		//System.out.println(s2);
	}

}