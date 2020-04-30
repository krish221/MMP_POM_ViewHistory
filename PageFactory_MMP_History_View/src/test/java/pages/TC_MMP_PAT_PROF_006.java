package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.Base_Test;

public class TC_MMP_PAT_PROF_006 extends Base_Test
{	
	
	@FindBy(xpath="//div[@align='center']/a[1]")WebElement ViewHistory;
	
	
	public TC_MMP_PAT_PROF_006()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void patientDetails()
	{
		ViewHistory.click();
		
		if(driver.getTitle().equals("history"))
		{
			System.out.println("Execution success and you are in view history page");
		}else
		{
			System.out.println("Execution fail");
		}
	}

}
