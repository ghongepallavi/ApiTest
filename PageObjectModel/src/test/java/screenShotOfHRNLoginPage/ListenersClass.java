package screenShotOfHRNLoginPage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

 public class ListenersClass extends BaseTest implements ITestListener {
    	
public void onTestFailure(ITestResult res)
	{
	System.out.println("Test failed");
	
	try 
		{
			LaunchBrowser();
		} 
	catch (InterruptedException e)
		{
			
			e.printStackTrace();
		}
	try 
		{
		getScreenShot();
		} 
	catch (IOException e)
		{
		
		e.printStackTrace();
		}
	
		
	}
}

