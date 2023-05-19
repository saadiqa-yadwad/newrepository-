package selenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;
public class selenium2 {

	public static void main(String[] args)throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\software\\chromedriver.exe");
	RemoteWebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElementByClassName("gLFyf").sendKeys("how to improve ");
	Thread.sleep(3000);
List<WebElement> elems=driver.findElements(By.xpath("//div[@class='wM6W7d']"));
int i=0;
System.out.println("soeeeeeze"+elems.size());
String s=elems.get(i).getText();
	 ////div[@class='erkvQe']//div[@class='OBMEnb']//ul/li//div[@class='eIPGRd']/div[@class='pcTkSc']//div[@class='lnnVSe']/div[@class='wM6W7d']
	 for(i=0;i<elems.size();i++) 
	 {
		 
		if(s.contains("communication skills"))
		{
			elems.get(i).click();
			System.out.println(" clicked");
			break;
		}
			
	 }
	 Thread.sleep(2000);
	 //for search button in coursera website
	 ////button[@aria-label='Search Coursera']  or //div[@class='magnifier-wrapper']
	 //
	//driver.findElementByXPath("//div[@class='yuRUbf']//a[@ping='/url?sa=t&source=web&rct=j&url=https://www.manpowergroup.com/en/insights/10-communication-skills&ved=2ahUKEwi6sJrmoZb-AhVURWwGHTWHDdEQFnoECBUQAw']/h3[@class='LC20lb MBeuO DKV0Md']").click();
 
	driver.findElementByXPath("//div[@class='yuRUbf']//a[@href='https://www.coursera.org/articles/communication-skills']").click();
	
	
	Thread.sleep(2000);
driver.findElementByXPath(" //div[@class='browse-content-wrapper horizontal-box']//input[@role='textbox']").sendKeys("IBM ");
	Thread.sleep(2000);
List<WebElement> suggestions=driver.findElements(By.xpath("//div[@class='vertical-box']"));

Thread.sleep(2000);
	//driver.quit();
	System.out.println("really "+suggestions.size());
	
	//String s1=suggestions.get(0).getText();
	 ////div[@class='erkvQe']//div[@class='OBMEnb']//ul/li//div[@class='eIPGRd']/div[@class='pcTkSc']//div[@class='lnnVSe']/div[@class='wM6W7d']
	//System.out.println(s1);
	for(i=0;i<suggestions.size();i++) 
	 {
		System.out.println(i+")"+" went inside loop ");
		System.out.println(suggestions.get(i).getText());
		if(suggestions.get(i).getText().contains ("IBM Data Science"))
		{
			System.out.println("matched");
			suggestions.get(i).click();
			System.out.println(" clicked");
			break;
		}
			
	 }
	}
}
