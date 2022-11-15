package screenShotOfHRNLoginPage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.reporters.Files;

public class BaseTest extends ScreenShotClass{
	 
	static WebDriver driver;
	public void LaunchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\chromedriver.exe");// to set properties
		driver = new ChromeDriver();// open a browser
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	}

		
		
		
}
