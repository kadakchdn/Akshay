package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GeneratlUtilities 
{
	public static String r_email;
	public static String r_password;
	
	public static String generateDynamicFirstname()
	{
		String firstname=RandomStringUtils.randomAlphabetic(5);
		return firstname;
	}
	
	public static  String generateDynamicLastname()
	{
		String lastname=RandomStringUtils.randomAlphabetic(5);
		return lastname;
	}
	
	public static String generateDynamicEmail()
	{
		String lastname=RandomStringUtils.randomAlphabetic(5);
		String Email=lastname+"@gmail.com";	
		return Email;
	}
	
	public static String generateDynamicPassword()
	{
		String lastname=RandomStringUtils.randomAlphabetic(5);
		String password =lastname+"123";
		return password;
	}
	
	public static void scrollingPage(WebDriver driver)
	{
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript( " window.scrollBy(0, document.body.scrollHeight) " );
	}
	
	
	public static void onlyTakingScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f1 = ts.getScreenshotAs(OutputType.FILE);
		File f2=new File("./Screenshots/akshay.png");
		FileUtils.copyFile(f1, f2);
	}
	
}
