package String_Manipulations;

public class String_Funcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		String str="The rains started here in syndeny";
		
		str.length();
		str.charAt(9);
		System.out.println(str.indexOf('s'));
	
	    int s=	str.indexOf('s', str.indexOf('s')+1);
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		//System.out.println(str.indexOf('s',s+1)); 
		
		String s1="hello i am here";
        System.out.println(s1.substring(2, 8));		
        String s2="hello i am here";
        System.out.println(s1.equals(s2));
        
        String s3="  hello how ";
        
        String s4=s3.trim();
        
        System.out.println(s4);
        
        System.out.println(s3.replaceAll(" ", ""));
        
       String s5="01-2017-12";
       System.out.println(s5.replace("-", "/"));
       
       
       //split function
       
       
       String test="Hello_World_test_selenium";
       
       String test1[]=test.split("_");
       
       for(int i=0; i<test1.length; i++)
       {
    	   System.out.println(test1[i]);
       }
       
       String t1="Cares";
       System.out.println(t1.concat(s));
       
	
	*/
	

   	String n1 = "The rains have strated here";
   	String n2 = "The Rains have started here";
   	
   
  
   	//1. Legth --
   	
   	//2. Index
   	
   	//3. get the character from specific index
   	
   	//4. Comparison
   	
   	boolean b= n1.equals(n1);
   	System.out.println(b);
   	
   	//5. Substring
	
	System.out.println(n1.substring(3));
	
	System.out.println(n1.substring(2, 10));
	
	
	//6. trim
	String n3=" Hello world ";
    System.out.println(n3.trim());

	//7. replace
    
    String n4= "Hello world";
    System.out.println(n4.replace(" ", ""));
    
    String n5="10/01/2018";
    System.out.println(n5.replace("/", "-"));
    
	
    //8. Split -- return type of split is array
    String test = "Hello_World_Test_Selenium";
    //System.out.println(test.split("_")); java.lang exception
    String testval[] = test.split("_");
    for(int i=0; i<=testval.length-1; i++)
    {
    System.out.println(testval[i]);	
    }
    String n7="hi";
    String n6="Hello";
    System.out.println(n6.concat(n7));
    
}	
}