


	package selenium1;

	import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
	public class SessionRunner
	{
	
		public static void main(String[] args) throws InterruptedException {
			
		
	System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
	
	ChromeOptions opt=new ChromeOptions();
	opt.addExtensions(new File("Ext.crx"));
	ChromeDriver driver =new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://attendee.gotowebinar.com/recording/7966611982659918940");
	
	
	
	
	System.out.println("wohooo!! Extensions Added  and sessions are running successfully ");
	
	
	
	
	
	
	

	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='registrant.firstName']")).sendKeys("saadiqa");

	driver.findElement(By.xpath("//input[@id='registrant.lastName']")).sendKeys("yaadwad");

	driver.findElement(By.xpath("//input[@id='registrant.email']")).sendKeys("saadiqayadwad@gmail.com");

	Thread.sleep(1000);
	driver.findElement(By.id("registration.submit.button")).click();
	//Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	
	driver.findElement(By.xpath("//button[@title='Unmute']")).click();

	driver.findElement(By.xpath("//button[@title='Fullscreen']")).click();
	//driver.switchTo().parentFrame();*/
	}
	}



