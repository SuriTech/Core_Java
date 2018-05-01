import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CNN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Suren\\Common\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.navigate().to("http://cnn.com/");
		//driver.manage().window().maximize();
		String p1="//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/article[";
		String p2="]/div/div/h3/a/span[1]";
		
		for(int i=2;i<=10; i++)
		{
			String txt=driver.findElement(By.xpath(p1+i+p2)).getText();
			System.out.println(txt);
			driver.findElement(By.xpath(p1+i+p2)).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			System.out.println("************************************");
		    
		}
		
		driver.quit();
		
	}

}
