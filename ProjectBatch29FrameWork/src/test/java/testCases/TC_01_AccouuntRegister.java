package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageFactory.AccountPage;
import pageFactory.HomePage;
import pageFactory.RegisterPage;
import utilities.GeneratlUtilities;



public class TC_01_AccouuntRegister extends BaseTestCase
{

 
	
	@Test
	void Register() throws InterruptedException
	{
		
		HomePage hp=new HomePage(driver);
		hp.clickOnMyAccount();
		logger.info("clicked on myaccount");
		hp.clickOnMyRegister();
		
		RegisterPage rp=new RegisterPage(driver);
		rp.enterFirstName();
		logger.info("first name entered");
		rp.enterLatName();
		rp.enterEmail();
		rp.enterPassword();
		
		logger.info("password entered");
		
		GeneratlUtilities.scrollingPage(driver);
		logger.info("page scrolled"); 
		
		Thread.sleep(10000);
		rp.togglePrivacyIcon();
		rp.clickContinueButton();
		
		AccountPage ap=new AccountPage(driver);
		String actul_text =ap.getRegistrationsuccessfultext();
		String expected_Text="Your Account Has Been Created!";
		
		Assert.assertEquals(actul_text, expected_Text);
	
		logger.info("Test case passed");
		
	}

}
