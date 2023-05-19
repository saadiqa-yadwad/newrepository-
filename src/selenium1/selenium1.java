package selenium1;
import java.util.*;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;
public class selenium1 {

	public static void main(String[] args)throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
	RemoteWebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElementByClassName("gLFyf").sendKeys("how to  ");
	List<WebElement> elems=driver.findElements(By.xpath("//div[@class='erkvQe']//div[@class='OBMEnb']//ul/li/descendant::div[@class='wM6W7d']"));
	Thread.sleep(2000);
	System.out.println(elems.size());
	driver.quit();

	}

}
