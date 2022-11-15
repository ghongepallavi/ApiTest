package extendsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	 
public void LaunchBrowser() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com");
	 Thread.sleep(2000);
	
}
}
