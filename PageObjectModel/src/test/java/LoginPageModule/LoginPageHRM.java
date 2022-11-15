package LoginPageModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageHRM {
	
		@FindBy(xpath="//input[@name='username']")
		private WebElement UserName;
		@FindBy(xpath="//input[@name='password']")
		private WebElement Password;
		@FindBy(xpath="//button[@type='submit']")
		private WebElement LoginBtn;
		
		public void sendUserName(String Uname)
		{
			UserName.sendKeys(Uname);
		}
		public void sendPassword(String Pass)
		{
			Password.sendKeys(Pass);
		}
		public void sendClickOnloginBtn()
		{
			LoginBtn.click();
		}
		public LoginPageHRM(WebDriver d1)
		{
			PageFactory.initElements(d1, this);
		}
}
