package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.Base_Test;

public class TC_MMP_PAT_PROF_005 extends Base_Test
{
		
	
		
	@FindBy(xpath="//*[@class='nav  nav-list']/li[3]")WebElement ProfileButton;
		
	public TC_MMP_PAT_PROF_005()
	{
		PageFactory.initElements(driver, this);
	}
		
	public void portal_HomePage()
	{		
		ProfileButton.click();
		
		if(driver.getTitle().equals("profile"))
		{
			System.out.println("Execution success and you are in personal Details page");
		}else
		{
			System.out.println("Execution fail");
		}
	}
}
