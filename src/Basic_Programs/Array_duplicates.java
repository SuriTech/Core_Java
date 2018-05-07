package Basic_Programs;

import java.util.ArrayList;

//Find duplicate elements in array and store those duplicates in another array

public class Array_duplicates {

	public static void main(String[] args) {

		int a[] = { 10, 20, 10, 40, 50, 20, 70 };
		int b[] = new int[4];
		int size = a.length;
		int count = 0;
		for (int i = 0; i < size+1; i++) {
			for (int j = i + 1; j < size;) {
				if (a[j] == a[i]) {
					count++;
					for (int k = j; k < size+1; k++) {
						a[k] = a[k + 1];
					}
					size--;
				} else
					j++;
			}

		}

		for (int g=0; g<a.length; g++)
		{
			System.out.println(a[g]);
		}
		
	}
}