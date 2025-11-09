package QA.QA;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScriptingCode extends ReusedMethods{
	
	public void login() throws InterruptedException, IOException
	{         //........... LOGIN ........                      //........... LOGIN ........
		
	driver.get("https://erpqa.azurewebsites.net/auth/login");
	screenshot("login page 1");
    sleep(2);
	Actions action = new Actions (driver);

	driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("Gopireddy");
	 sleep(1);
	action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	 sleep(1);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password@123");
	 sleep(1);
	action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	 sleep(1);
	driver.findElement(By.xpath("//input[@formcontrolname='captcha']")).sendKeys("123456");
	 sleep(2);
	screenshot("Valid Credentials 2");
	 sleep(1);
	action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	 sleep(1);
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	 sleep(2);
	 screenshot("Home page 3");
	}         //........... LOGIN ........                      //........... LOGIN ........
	
	public void dashboard() throws InterruptedException
	{
		 sleep(2);
		 driver.findElement(By.xpath("//*[@id=\"kt_body\"]/app-banner/div/div/div[2]/button")).click();
		//button[text()='×']
	}
	
	 public void Estimation() throws InterruptedException, AWTException, IOException
	   {        //........... ESTIMATION ........                      //........... ESTIMATION ........
		   driver.findElement(By.xpath("(//span[text()='Estimation'])[1]")).click();
		  
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='barcodeNumber']"))).sendKeys("66");
		 //  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("66");
		 sleep(2000);
		   driver.findElement(By.xpath("//button[text()='Search']")).click();
		 sleep(2000);
		
		     sleep(2000);
		   ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");  // scrolls down 500px
		   screenshot("barcode esti");
		   sleep(2000);
		  driver.findElement(By.xpath("//button[@type='button']")).click();
		 
		   sleep(3000);
		   printUsingRobot("preview");
		 Robot robot = new Robot();
		   
		   robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER); 
	   }         //........... ESTIMATION ........                      //........... ESTIMATION ........
	
	
	public void more() throws InterruptedException, IOException 
	{    //........... MORE ........                      //........... MORE ........
		
		    sleep(2);
			WebElement moreElement = driver.findElement(By.xpath("//span[text()='More']"));
			sleep(2);
			Actions action = new Actions(driver);
			action.moveToElement(moreElement).pause(2000).click().build().perform();
			screenshot("More 4");
			sleep(2);        
			//	action.moveToElement(driver.findElement(By.xpath("//span[text()='More']"))).pause(2000).click().build().perform();

	}    //........... MORE ........                      //........... MORE ........
	
	
	
	public void master() throws InterruptedException, IOException
	{        //........... MASTER ........                      //........... MASTER ........
		     sleep(2);
			WebElement masterElement = driver.findElement(By.xpath("//span[text()='Master']"));
			sleep(2);
			Actions action = new Actions(driver);
			action.moveToElement(masterElement).pause(2000).click().build().perform();
			sleep(2); 
			screenshot("master5");
			sleep(2); 
		
	
	}       //........... MASTER ........                      //........... MASTER ........

	
	
	public void addPurity() throws InterruptedException, IOException
	{        //........... ADD PURITY ........                      //........... ADD PURITY ........
		
		     driver.findElement(By.xpath("//button[text()=' + Add Purity ']")).click();
		     sleep(1);
		     driver.findElement(By.xpath("//input[@formcontrolname='purityValue']")).sendKeys("10karat");
		     sleep(1);
		     driver.findElement(By.xpath("//input[@formcontrolname='purityPercentage']")).sendKeys("58.12");
		     sleep(1);
		     driver.findElement(By.xpath("//input[@formcontrolname='shortForm']")).sendKeys("10k");
		     sleep(1);
		     driver.findElement(By.xpath("//input[@formcontrolname='vAPercentage']")).sendKeys("2");
		     sleep(1);
		     driver.findElement(By.xpath("//button[@type='submit'and@class='btn btn-primary']")).click();
		     sleep(1);
		     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");  // scrolls down 500px
		     sleep(3);
		     screenshot("Purity_Saved_List6");
		 
	
	}       //........... ADD PURITY ........                      //........... ADD PURITY ........

	
	
	public void price() throws InterruptedException
	{
     		//........... PRICE ........                      //........... PRICE ........
		
		sleep(2);
		WebElement moreElement = driver.findElement(By.xpath("//span[text()='More']"));
		sleep(2);
		Actions action = new Actions(driver);
		action.moveToElement(moreElement).pause(2000).click().build().perform();
		driver.findElement(By.xpath("//span[text()='Prices']")).click();
		sleep(2);       
		
		
		
	     	//........... PRICE ........                      //........... PRICE ........
	}
	public void Scheme() throws InterruptedException
	   
	   {
		   
		   WebElement moreElement = driver.findElement(By.xpath("//span[text()='More']"));
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			action.moveToElement(moreElement).pause(2000).click().build().perform();
			driver.findElement(By.xpath("//*[@id=\"#kt_header_menu\"]/div[6]/div/div/div/div[15]/div/a/span[2]")).click();
			Thread.sleep(2000);
		
			WebElement CreateScheme=driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[6]"));
			Actions Create=new Actions(driver);
			action.moveToElement(CreateScheme).pause(2000).click().build().perform();
			
		WebElement Scheme=driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/div/div/form/div/div[1]/ng-select/div/span"));
			Thread.sleep(2000);
		
			Scheme.click();
			//Select s=new Select(Scheme);
			//s.selectByIndex(1);
			WebElement Savings=driver.findElement(By.xpath("//span[contains(text(),'Savings')]"));
			Thread.sleep(5000);

			Savings.click();
			
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[2]/div[1]/input")).sendKeys("gold loan");
			
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[2]/div[2]/input")).sendKeys("9");
         
			//Date Picker
			
			String edate="1";
			String emonth="January";
			String eyear="2025";
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[2]/div[3]/mat-form-field/div/div[1]/div[2]")).click();
			Thread.sleep(2000);
			
			while(true)
			{
				String amonth=driver.findElement(By.xpath("//td[@class='mat-calendar-body-label ng-star-inserted']")).getText();
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"mat-calendar-button-10\"]")).click();
				Thread.sleep(2000);
				
				String ayear=driver.findElement(By.xpath("mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-today")).getText();
				
				if(ayear.equals(eyear)&&amonth.equals(emonth))
				{
					List<WebElement>alldays=driver.findElements(By.xpath("//table//tbody//tr//td"));////*[@id="mat-datepicker-0"]/mat-calendar-header/div/div/button[1]/span[1]/svg/polygon
					
					for(int d=0;d<alldays.size();d++)
					{
						System.out.println(alldays.get(d).getText());
						
						if(alldays.get(d).getText().equals(edate))
						{
							Thread.sleep(2000);
							alldays.get(d).click();
							break;
						}
						}
					break;
					}
				else
				{
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[@aria-label='Next month")).click();////*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[2]
					Thread.sleep(2000);
				}
				//Manju Gopi
				
				//public void Manju()
				{
					
				}
			}
	   }
	
	
	
	
}
