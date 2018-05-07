package Basic_Programs;

public class Break_Stmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for (int i=0; i<=100; i++)
		{
			if (i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
		*/
		
		for (int i=1; i<=100; i++)
		{
			if (i%2==0)
			{
				break;
			}
			System.out.println(i);
		}
		
	}

}
