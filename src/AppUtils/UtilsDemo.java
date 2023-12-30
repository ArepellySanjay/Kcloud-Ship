package AppUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class UtilsDemo
{

	
    public static String url  ="https://ecs-qa.kloudship.com";
	
 public static WebDriver driver; 
	
	@BeforeSuite
   public static void LanchApp() 
   {
	   
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get(url);
	   
	   
   }
	@AfterSuite
	public static void closeApp()
	{
		
		driver.close();
		
	}
	
	
	
}
