package Basic_Programs;
public class Strings_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st= "hello123";
		
int s1=st.length();

System.out.println(s1);
char c=st.charAt(1);
System.out.println(c);

String s12=st.substring(0, 3);
System.out.println(s12);

String s3=st.toUpperCase();

System.out.println(s3);

String s4=st.toLowerCase();
System.out.println(s4);
	
String sp= "hello1234";

boolean b=st.equals(sp);
System.out.println(b);

boolean b1=st.equalsIgnoreCase(sp);
System.out.println(b1);

String s8=st.toString();
System.out.println(s8);

boolean s9=sp.contains(st);

System.out.println(s9);

	}

}
