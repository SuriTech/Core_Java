package Test_Practice_Programs;

public class Lower_Upper {

public static void main(String[] args) {

int a[]= {100,20,201,15,10};
int max=a[0];

for(int i=0; i<a.length; i++)
{
if(max<a[i])
{
max=a[i];
}		
}
		
		
System.out.println(max);		
		
		
}

}
