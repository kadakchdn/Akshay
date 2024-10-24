package testCases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTestCase 
{
	public WebDriver driver;
	Logger logger;
	
	@Parameters({"browser"})
	@BeforeMethod
	void setUp(String browsername)
	{
		logger = LogManager.getLogger(this.getClass());
		
		
		   switch(browsername.toLowerCase())
	       {
	         case "chrome": driver=new ChromeDriver(); break;
	          case "firefox": driver=new FirefoxDriver(); break;
	          case "edge": driver=new EdgeDriver(); break;
	          default : System.out.println("no matching browser");
	          return; 
	        }
	
		   driver.get("https://demo-opencart.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@AfterMethod
	void tearDown()
	{
		driver.close();
	}

}
