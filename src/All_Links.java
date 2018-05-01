import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Suren\\Common\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("http://bbc.com");
		System.out.println("All links are as below");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println("Total links are=="+count);
		for (int i=0; i<count; i++)
		{
			System.out.println(links.get(i).getText());
		}

	}

}
