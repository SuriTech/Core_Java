package Interview_Preparation;

public class CallByValueRef {

	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueRef obj = new CallByValueRef();
		int x = 10;
		int y = 20;
		int m = obj.testSum(x, y); // call by value or pass by value
		System.out.println(m);
		obj.p = 20;
		obj.q = 30;

		obj.swap(obj); // call by ref

		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int testSum(int a, int b) // copy of x and y given to a,b
	{
		a = 30;
		b = 40;
		int c = a + b;
		return c;
	}

	public void swap(CallByValueRef t) {
		int temp;

		temp = t.p;
		t.p = t.q;
		t.q = temp;
System.out.println(" CR "+t.p +" " +t.q);
	}
}