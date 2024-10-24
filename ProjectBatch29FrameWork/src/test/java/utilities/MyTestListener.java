package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testCases.BaseTestCase;

public class MyTestListener  implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = null;
		
		try {
			 driver = (WebDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
			 try {
				GeneratlUtilities.onlyTakingScreenshot(driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	
}