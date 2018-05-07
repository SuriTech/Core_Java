package IQuestions;

public class Equals_Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="hello";
		String y="hello";
		String z="hello1";
		System.out.println(x==y);
		System.out.println(y==z);
        System.out.println(x.equals(y));

        A a1=new A();
        A a2=new A();
        a1.i=100;
        a2.i=100;
        System.out.println(a1.i==a2.i);
        System.out.println(a1==a2);//object
        a1=a2;
       // System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
	}
	
}
class A	
{
	int i;
public boolean equals(Object o)
{
	System.out.println("hello");
	return false;	
}
}