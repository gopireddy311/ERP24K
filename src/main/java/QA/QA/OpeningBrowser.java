package QA.QA;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class OpeningBrowser
{
	public static WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException 
	  {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\gopir\\git\\ERP24K\\BROWSERS\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 Thread.sleep(2000);
		 
		 
	   }
	 
 //Gudda musukoni 
//dengey
 
        @AfterClass
        public void afterClass()
        {
     	// driver.quit();
        }

}
