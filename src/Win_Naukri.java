import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Win_Naukri {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Suren\\Common\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		ArrayList<String> lt= new ArrayList<>(driver.getWindowHandles());
		System.out.println("Total windows are" +lt.size());
		String mwin=lt.get(0);		
		for(int i=1; i<lt.size(); i++)
		{
			if (i==3)
			{
				
			
			driver.switchTo().window(lt.get(i));
			driver.close();
			break;
		}}
		driver.switchTo().window(mwin);
		
	}

}