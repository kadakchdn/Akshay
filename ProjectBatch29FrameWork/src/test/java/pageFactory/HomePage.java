package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
        WebDriver driver;
	    public HomePage(WebDriver driver)
	    {
	    	this.driver=driver;
	        PageFactory.initElements(driver, this);
	    	
		}
	
	
	   //locating elements using @FindBy annotation
		@FindBy(xpath="//span[text()='My Account']")
		WebElement myaccount;
		
		@FindBy(xpath="//a[text()='Register']")
		WebElement register;
		
		@FindBy(xpath="(//a[text()='Login'])[1]")
		WebElement login;

		//add element for seach field
		
		//add element for search button
		
		
		
	   //methods to perform actions to page elements
		
	   public void clickOnMyAccount()
	   {
		   myaccount.click();
	   }

	   public void clickOnMyRegister()
	   {
		   register.click();
	   }

	   public void clickOnlogin()
	   {
		   login.click();
	   }
	   
	   //add method to enter text into searchfield
	   
		
	   //click on search button 
	   
		
}
