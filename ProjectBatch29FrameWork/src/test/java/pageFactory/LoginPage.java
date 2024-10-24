package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	 WebDriver driver;
	    public LoginPage(WebDriver driver)
	    {
	    	this.driver=driver;
	        PageFactory.initElements(driver, this);
	    	
		}
	
	
	   //locating elements using @FindBy annotation
		@FindBy(xpath="//input[@id='input-email']")
		WebElement emailaddressfield;
		
		@FindBy(xpath="//input[@id='input-password']")
		WebElement passwordfield;
		
		@FindBy(xpath="//button[normalize-space()='Login']")
		WebElement loginbutton;

		
		
	   //methods to perform actions to page elements
		
	  

	   public void enterEmailforLogin( String emailid)
	   {
		   emailaddressfield.clear();
		   emailaddressfield.sendKeys(emailid);
	   }

	   public void enterPassword(String password)
	   {
		   passwordfield.clear();
		   passwordfield.sendKeys(password);
	   }

	   public void clickOnloginButton()
	   {
		   loginbutton.click();
	   }
		

}
