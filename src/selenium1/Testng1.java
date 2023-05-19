package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 
{
	
	@BeforeTest
	public void f1() throws InterruptedException 
	{
	 
		System.setProperty("webdriver.chrome.driver", "C:\\software\\chrome driver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.get("https://www.google.com");
	//Thread.sleep(2000);
	//  System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");*/
}
	
	
	
}


