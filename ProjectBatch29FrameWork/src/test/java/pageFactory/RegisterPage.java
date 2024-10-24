package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneratlUtilities;

public class RegisterPage 
{
	

    WebDriver driver;
    public RegisterPage(WebDriver driver)
    {
    	this.driver=driver;
        PageFactory.initElements(driver, this);
    	
	}


   //locating elements using @FindBy annotation
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstname_field;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastname_field;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email_field;

	@FindBy(xpath="//input[@id='input-password']")
	WebElement password_field;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement privacy_toggle;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement continue_button;
	
	
	
	//methods to perform actions to page elements
	public void enterFirstName()
	{
	
		firstname_field.sendKeys(GeneratlUtilities.generateDynamicFirstname());
	}
	
	public void enterLatName()
	{
		lastname_field.sendKeys(GeneratlUtilities.generateDynamicLastname());
	}
	
	public void enterEmail()
	{
		 String email=GeneratlUtilities.generateDynamicEmail();
		System.out.println(email);
		
		email_field.sendKeys(email);
		 GeneratlUtilities.r_email   = email;
	}

	public void enterPassword()
	{
	    String password=GeneratlUtilities.generateDynamicPassword();
	   System.out.println(password);
		password_field.sendKeys(password);
		GeneratlUtilities.r_password=password;
		
	}
	
	public void togglePrivacyIcon()
	{
		privacy_toggle.click();
	}
	
	public void clickContinueButton()
	{
		continue_button.click();
	}

	
}
