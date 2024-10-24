package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageFactory.HomePage;
import pageFactory.LoginPage;
import pageFactory.MyAccount;
import pageFactory.RegisterPage;
import utilities.GeneratlUtilities;

public class TC_02_Login extends BaseTestCase
{
	
	@Test
	void login() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnMyAccount();
		hp.clickOnlogin();
		
		//enter email password
		LoginPage lp=new LoginPage(driver);
	lp.enterEmailforLogin(GeneratlUtilities.r_email);
	logger.info("email entered");
	lp.enterPassword(GeneratlUtilities.r_password);
	
	    //click on login button
		lp.clickOnloginButton();
		
		Thread.sleep(10000);
		
		MyAccount ma=new MyAccount(driver);
		String actual_Text = ma.returntextAfterLogin();
		String expected_Text="My Account123";
		
		Assert.assertEquals(actual_Text, expected_Text);
		
		logger.info("Login Test Case Pass");
		
		
		
	}
 
}
