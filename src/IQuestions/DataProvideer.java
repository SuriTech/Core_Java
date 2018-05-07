package IQuestions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideer {

	
@Test(dataProvider="getData")
public void Login(String uname,String password, String browserType)
{
	Assert.assertEquals("A", "B");
}

@DataProvider
public Object[][] getData()
{
	Object data[][]= new Object[2][3];
	
	data[0][0]="name";
	data[0][1]="pass";
	data[0][2]="Chrome";
	
	data[1][0]="name1";
	data[1][1]="pass1";
	data[1][2]="firefox";
	
	return data;
			
}
	
}