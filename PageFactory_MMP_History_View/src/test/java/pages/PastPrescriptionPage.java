package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.Base_Test;

public class  PastPrescriptionPage extends Base_Test {
	
	
		@FindBy(xpath="//table//tbody//tr[1]//td[1]//a//ul//li")WebElement fever;
		@FindBy(xpath="//table//tbody//tr[1]//td[1]//a//ul//li/div/p")WebElement date;
		
		public PastPrescriptionPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void viewPastPrescription()
		{
			String prescription = fever.getText();
			String PresDate =date.getText();
			System.out.println("The new prescription on  " + PresDate+ " of ria1 is " + prescription);
			
		
	}

}
