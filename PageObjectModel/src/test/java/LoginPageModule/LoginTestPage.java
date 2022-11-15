package LoginPageModule;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(LoginPageModule.ListenersClass.class)

public class LoginTestPage  {
LoginPageHRM hrmLP;
	
	static WebDriver driver;
	SoftAssert s;
	@BeforeTest
	public void TestPage() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\chromedriver.exe");// to set properties
		driver = new ChromeDriver();// open a browser
		Thread.sleep(3000);
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
	}
	@BeforeClass
	public void objectcreation() throws InterruptedException
	{
		hrmLP = new LoginPageHRM(driver);
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		s=new SoftAssert();
	}
	@BeforeMethod
	public void Loginfunctionality() throws InterruptedException
	{
		hrmLP.sendUserName("admin");
		Thread.sleep(3000);
		hrmLP.sendPassword("admin123");
		Thread.sleep(3000);
		hrmLP.sendClickOnloginBtn();
		Thread.sleep(3000);
		Thread.sleep(3000);
	}
	@Test
	public void VerifyHomepage () throws InterruptedException
	{
		String LoginPageUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		//String HPUrl=driver.getCurrentUrl();
		s.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",driver.getCurrentUrl());
		s.assertAll();
	}
	
	@AfterClass
	public void Clearobject()
	{
		hrmLP=null;
		
		s=null;
	}
	@AfterTest
	public void clearDriver()
	{
		driver.quit();
		driver=null;
		System.gc();
		
		
	}
}
