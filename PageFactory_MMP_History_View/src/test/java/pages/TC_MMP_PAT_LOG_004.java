package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.Base_Test;

public class TC_MMP_PAT_LOG_004 extends Base_Test {

	@FindBy(xpath = "//input[@id='username']")
	WebElement userName;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submit;
	@FindBy(tagName="h3")WebElement PName;
	
	public TC_MMP_PAT_LOG_004()
	{
		  PageFactory.initElements(driver, this); 
	}
	
	
public void login()
{
	userName.sendKeys(config.getProperty("username"));
	password.sendKeys(config.getProperty("password"));
	submit.click();
	String name =PName.getText();
	System.out.println("login successfuel and you are: "+name+ " patient page");
	
	
}	
}
