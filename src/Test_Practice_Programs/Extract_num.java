package Test_Practice_Programs;

public class Extract_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Surendra123";
		int digits=Integer.parseInt(str.replaceAll("[^0-9]", ""));
		System.out.println(digits);
	}

}
