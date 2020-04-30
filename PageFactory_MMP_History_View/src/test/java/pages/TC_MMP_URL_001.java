package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.Base_Test;

public class TC_MMP_URL_001 extends Base_Test
{
	
	@FindBy(css="ul#navigation li:nth-child(2) a") WebElement patient_Login;
	//By PatientLoginLink = By.cssSelector("ul#navigation li:nth-child(2) a");
	//@FindBy(how = How.CSS,using="ul#navigation li:nth-child(2) a")WebElement patient_LoginLink;
	
	@FindBy(xpath="//section[@id='testimonials']//div[2]/a") WebElement P_Login;
	//@FindBy(how=How.XPATH,using="//section[@id='testimonials']//div[2]/a") WebElement P_LoginLink;
	
	
	  public TC_MMP_URL_001() 
	  {
		  PageFactory.initElements(driver, this); 
	   }
	
	public void patient_Click()
	{
		//driver.findElement(PatientLoginLink).click();
		patient_Login.click();
	}
	
	public void P_Click()
	{
		P_Login.click();
		
		if(driver.getTitle().equals("Login"))
		{
			System.out.println("Execution success and you are in login page");
		}else
		{
			System.out.println("Execution fail");
		}
	}
	
	
	
	
}

