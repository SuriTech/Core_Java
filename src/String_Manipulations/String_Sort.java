package String_Manipulations;

public class String_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String original = "edcba";
		
		char temp=0;
		 
		  char[] chars = original.toCharArray();
		 
		  for (int i = 0; i <chars.length; i++) {
		 
		      for ( int j = 0; j < chars.length; j++) {
		 
		       if(chars[j]>chars[i])
		       {
		            temp=chars[i];
		           chars[i]=chars[j];
		           chars[j]=temp;
		       }
		 
		   }  
		 
		}
		 
		for(int k=0;k<chars.length;k++){
		System.out.println(chars[k]);
		}
		
		
	}

}
