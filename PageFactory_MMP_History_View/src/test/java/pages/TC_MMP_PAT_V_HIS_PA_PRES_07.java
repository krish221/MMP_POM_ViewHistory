package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.Base_Test;

public class TC_MMP_PAT_V_HIS_PA_PRES_07 extends Base_Test {


	@FindBy(xpath="//div[@id='wrapper']/p[4]/a/input")WebElement Past_prescription ;
	@FindBy(xpath="//div[@class='panel-heading']/h3")WebElement view_prescription;
	
	
	public TC_MMP_PAT_V_HIS_PA_PRES_07()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void viewprescription()
	{
		Past_prescription.click();
		
		
		  String text =view_prescription.getText();
		  System.out.println("execution successfuel and you are on : "+text+ " page");
		 
	}
}
