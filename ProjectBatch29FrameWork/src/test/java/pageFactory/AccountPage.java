package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage 
{
	  WebDriver driver;
	    public AccountPage(WebDriver driver)
	    {
	    	this.driver=driver;
	        PageFactory.initElements(driver, this);
	    	
		}
	
	
	   //locating elements using @FindBy annotation
		@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
		WebElement text;
		
		
	  

	   public String getRegistrationsuccessfultext()
	   {
		   String account_successfully_Registered_text =text.getText();
		   return account_successfully_Registered_text;
	   }

	   
}
