package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount 
{

	WebDriver driver;
    public MyAccount(WebDriver driver)
    {
    	this.driver=driver;
        PageFactory.initElements(driver, this);
    	
	}

   //locating elements using @FindBy annotation
	@FindBy(xpath="//div[@id='content']/h2[text()='My Account']")
	WebElement successfullogintext;
	
   //methods to perform actions to page elements
   public String returntextAfterLogin()
   {
	   String text_present_after_login=successfullogintext.getText();
	   return  text_present_after_login;
   }

 
	
}
