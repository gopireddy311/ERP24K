package QA.QA;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class OpeningBrowser
{
	public static WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException 
	  {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\QA\\BROWSERS\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 
	   }

 
 
        @AfterClass
        public void afterClass()
        {
     	//  driver.quit();
        }

}
