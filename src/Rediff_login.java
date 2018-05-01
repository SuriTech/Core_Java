import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Suren\\Common\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("hello");
		//driver.findElement(By.xpath("//li[contains(@id, '1151')]")).click();
		driver.findElement(By.xpath("//li[@data-text='hello']")).click();
		driver.quit();
	}

}
