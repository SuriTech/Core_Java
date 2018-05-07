package collections;

import java.util.ArrayList;
import java.util.Scanner;
// *** Remove duplicate elements from list **************
public class ArrayList_RemDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 integers");
		ArrayList<Integer> lt = new ArrayList<Integer>();
		ArrayList<Integer> dup= new ArrayList<Integer>();
		
		for (int i=0; i<=4; i++)
		{
			lt.add(sc.nextInt());
		}
		
		System.out.println("Entered list is" +lt);
		
		
		for (int j=0; j<=lt.size()-1; j++)
		{
			for (int k=j+1; k<=lt.size()-1; k++)
			{
			if (lt.get(j)==lt.get(k))
			{
		    dup.add(lt.get(j));
	        lt.remove(k);
	        k--;

			}
			}		
		}
		
		//System.out.println("Duplicates are"+dup);
		System.out.println("list without duplicates is"+lt);
		System.out.println("Removed duplicate elements from  list is" +dup);
		
	}

}