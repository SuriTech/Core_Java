import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QSD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Suren\\Common\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("http://qtpselenium.com/home/contact_trainer");
		WebElement drp=driver.findElement((By.name("country_id")));
		/*drp.sendKeys("India");
		//driver.quit();
		List<WebElement> cnts=driver.findElements(By.tagName("option"));
		for(int i=1; i<cnts.size(); i++)
		{
			System.out.println(cnts.get(i).getText());
		}
	*/
		
	 Select st=new Select(drp);
	 
	 st.selectByValue("107");
	
	}

}