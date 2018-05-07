package String_Manipulations;

import java.util.ArrayList;

public class String_Nos_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "#tom@100#surendra@101#peter@102";

		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> id = new ArrayList<Integer>();

		String temp[] = str.split("#");

		for (String temp1 : temp) {
			String temp2[] = temp1.split("@");
			// System.out.println(temp2.length);
			for (int i = 0; i < temp2.length; i++) {
				try {
					id.add(Integer.parseInt(temp2[i]));

				} catch (Exception e) {
					names.add(temp2[i]);
				}
			}

		}
		System.out.println(names);
		System.out.println(id);
	}

}