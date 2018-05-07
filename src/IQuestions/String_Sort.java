package IQuestions;

import java.util.Arrays;
public class String_Sort {

public static void main(String[] args) {
		// TODO Auto-generated method stub

String str="cdefa";
/*char[] ch=str.toCharArray();
Arrays.sort(ch);
System.out.println(ch);
	*/
stringsort(str);
	}

public static void stringsort(String str)
{
	char ch[]=str.toCharArray();
	char temp=0;
	for (int i=0; i<ch.length; i++)
	{
		
		for (int j=0; j<ch.length; j++)
		{
			if (ch[j]>ch[i])
			{
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
	}

for(int k=0; k<ch.length; k++)
{
	System.out.print(ch[k]+ " ");
}
}		
}