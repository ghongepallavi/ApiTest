package screenShotOfHRNLoginPage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Listeners;

import LoginPageModule.LoginTestPage;

public class ScreenShotClass  {

	public void getScreenShot() throws IOException
	{
		
		File source = ((TakesScreenshot)BaseTest. driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Eclipse\\ScreenShotByProgram.\\failed.jpg");
		 
		FileHandler.copy(source, dest);
}}