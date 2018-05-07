package IQuestions;

public class Remove_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hello , 123    Iam going java            !";
		
		String str1[]=str.split("\\s+");
		//String str1=str.replaceAll(" ", "");// replaces spaces between words too

		for(String word: str1)
		{
System.out.print(word+ " ");		
}
		
	
	}

}
