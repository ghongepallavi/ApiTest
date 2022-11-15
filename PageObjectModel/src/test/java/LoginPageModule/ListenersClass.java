package LoginPageModule;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;


    public class ListenersClass implements ITestListener {
	
	public void onTestFailure(ITestResult res)
	{
	File source = ((TakesScreenshot)LoginTestPage . driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Stuff\\SeleniumScreenshots by program" +res.getName()+ ".jpg");
	System.out.println("Test failure..1..by SS"+res.getName()+".jpg");
		
	try 
	{
		Thread.sleep(2000);
	} 
		catch (InterruptedException e) 
	{
		e.printStackTrace();
	}
	}
		public void onTestSuccess(ITestResult Result)
	{
		System.out.println("Test success..1..by SS"+Result.getName()+".jpg");
		System.setProperty("webdriver.chrome.driver", "C:\\Stuff\\PathFiles\\chromedriver.exe");// to set properties
	
		File source1 = ((TakesScreenshot)LoginTestPage. driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Eclipse\\ScreenShotByProgram" +Result.getName()+ ".jpg");
			
	}
	}


