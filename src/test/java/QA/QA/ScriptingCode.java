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
import org.openqa.selenium.WebDriver;
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
	
	
		//........... CREATE SCHEME ........                      //........... CREATE SCHEME ........
	
	   public void Schemes() throws InterruptedException
	   {
		   // Click on create scheme tab
		   
		   WebElement moreElement = driver.findElement(By.xpath("//span[text()='More']"));
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			action.moveToElement(moreElement).pause(2000).click().build().perform();
			driver.findElement(By.xpath("//*[@id=\"#kt_header_menu\"]/div[6]/div/div/div/div[15]/div/a/span[2]")).click();
			Thread.sleep(2000);
		
			WebElement CreateScheme=driver.findElement(By.xpath("//button[text()='Create Schemes']"));
			Actions actions =new Actions(driver);
			actions.moveToElement(CreateScheme).pause(2000).click().build().perform();
			sleep(2);
			
			
			// Select Type (Flexi,Savings,Lucky Draw)
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/div/div/form/div/div[1]/ng-select/div/div/div[2]/input")).sendKeys("Savings");;
			sleep(1);
			
        // click on the savings
       	actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
         sleep(1);
         actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
         sleep(1);
         
          // scheme name
			driver.findElement(By.xpath("//input[@placeholder='Enter scheme name']")).sendKeys("gold loan");
			sleep(1);
			
			// scheme duration
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[2]/div[2]/input")).sendKeys("9");
			 sleep(2);
		
		   //Select the Scheme Start Date
         //  Click on the date icon
			
			 actions.moveToElement(driver.findElement(By.xpath("//span[@class='mat-button-wrapper']//*[name()='svg']"))).pause(2).click().build().perform();
			  sleep(1);
			// Click on the full date (13/11/2025)dropdown
			  actions.moveToElement(driver.findElement(By.xpath("//button[contains(@class,'mat-calendar-period-button')]"))).pause(2).click().build().perform();
		       sleep(1);
		      //  Click on the Year
		       actions.moveToElement(driver.findElement(By.xpath("//div[text()=' 2025 ']"))).pause(2).click().build().perform();
		       sleep(1);
			  //  Click on the Month
		       actions.moveToElement(driver.findElement(By.xpath("//div[text()=' SEPT ']"))).pause(2).click().build().perform();
			   sleep(1);
			  //  Click on the Day
			   actions.moveToElement(driver.findElement(By.xpath("//div[text()=' 1 ']"))).pause(2).click().build().perform();
		       sleep(2);
			

			//MemberShip Limit
		    driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[2]/div[4]/input")).sendKeys("12");
		    sleep(1);
		    
		    //Monthly Saving
		driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[3]/div[1]/input")).sendKeys("1000");
			//max monthly Saving
			   sleep(2);
		driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[3]/div[2]/input")).sendKeys("10000");
			//paying out period
			   sleep(2);
		driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[3]/div[3]/input")).sendKeys("1");
		 sleep(2);
		
		//instant pay out dropdown
			WebElement Pay=driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[3]/div[4]/ng-select/div/span"));
			Pay.click();
			sleep(1);
			// Click on the YES
			actions.moveToElement(driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']"))).pause(1000).perform();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	    	WebElement Yes=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ng-option-label ng-star-inserted']")));
		    sleep(1);
		    Yes.click();
		    sleep(1);
		    
		    //Late Payment details
		    driver.findElement(By.xpath("//div//input[@id='isLatePaymentDetails']")).click();
		    sleep(2);
		    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,700)");
		    
		    //Buffer days
		    driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[2]/div/div/div[2]/div[1]/input")).sendKeys("5");
		   
		  // Late deducation percentage
		    driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[2]/div/div/div[2]/div[2]/input")).sendKeys("9.89");

		    //Validation Condition
		   // Allowed Group Type
         driver.findElement(By.xpath("//div[@id='mat-select-value-1']")).click();
         sleep(2);
         
       // group Types (Select All,Gold,Sliver,Platinum)
   	  // To selectGold group
   	actions.moveToElement(driver.findElement(By.xpath("//span[text()=' Gold ']"))).pause(1000).click().build().perform();
     sleep(1);
     actions.sendKeys(Keys.ESCAPE).perform();//click to close the dropdown
     sleep(1);
     // To select Gold purity
     actions.moveToElement(driver.findElement(By.xpath("//span[text()='Select Purities']"))).pause(2000).click().build().perform();
     // ((JavascriptExecutor)driver).executeScript("document.body.click();");//click to close the dropdown
      sleep(3);
		   
	     // Click on the Select All
		    actions.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Select All']"))).pause(10).click().perform();
		    sleep(2);
         actions.sendKeys(Keys.ESCAPE).perform();  //click to close the dropdown
		    sleep(2);
		    
		    
		    // Diamond CheckBox
		     WebElement diamondCheckBox = driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"));
			sleep(2);
			diamondCheckBox.click();
			sleep(2);
			
			// Allowed Diamond Group Type
			   driver.findElement(By.xpath("//span[text()='Select group']")).click();
	            sleep(2);
	            
			// Select Diamond group
		     actions.moveToElement(driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='Gold']"))).pause(5).click().perform();
			sleep(1);
			 actions.sendKeys(Keys.ESCAPE).perform();  //To close the dropdown
			 sleep(1);
		
          //From diamond to select Gold group purites dropdown
		    WebElement GPD=	driver.findElement(By.xpath("//span[text()='Select Purities']"));
		    sleep(3);
		    GPD.click();
		    
		    sleep(3);
		    actions.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Select All']"))).pause(10).click().perform();
	         sleep(2);
	         actions.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
			//    ((JavascriptExecutor)driver).executeScript("document.body.click()");//To close the dropdown
		     sleep(2);
		     ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");

			
        //Scheme Benefits
		   //Gold Jewellery
		   //Bonus
		   sleep(8);
		   WebElement BonusType=driver.findElement(By.xpath("//*[@id=\"mat-select-value-5\"]/span"));
		   sleep(2);
			BonusType.click();
			sleep(2);
			
			//to select bonus type
		   actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-checkbox-4\"]/label/span[2]/span[2]"))).pause(5).click().perform();
		   sleep(2);
		   actions.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
		   
		     //Months Extra
		   sleep(2);
		   driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[1]/div/div[2]/div/ng-select/div/div/div[2]/input")).sendKeys("2 months");
		    
		   sleep(2);
	       	actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
	           sleep(5);
	           actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
      
	           //Discount VA
	           sleep(2);
	           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[1]/div/div[3]/div[1]/ng-select/div/div/div[2]/input")).sendKeys("Percentage");
		
	          
		       	actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		           sleep(5);
		           actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
	         
		           //discount Upto
		           sleep(2);
		           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[1]/div/div[3]/div[2]/input")).sendKeys("34");
			
                //Making Charges
		           sleep(2);
		           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[1]/div/div[4]/div/input")).sendKeys("23");
		           //discount on stone charges
		           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[1]/div/div[5]/div[1]/ng-select/div/div/div[2]/input")).sendKeys("Apply to All Stones");
		           sleep(2);
			       	actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
			           sleep(5);
			           actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
			           
			           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[1]/div/div[5]/div[2]/input")).sendKeys("32");
			           
			           // Scheme Benefits
			           //Diamond Jewellery
			           
			             //bonus Type
			           WebElement type=driver.findElement(By.xpath("//*[@id=\"mat-select-value-9\"]/span"));
			           sleep(2);
			           type.click();
			           
			           sleep(2);
			           actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-checkbox-6\"]/label/span[2]/span[2]"))).pause(5).click().perform();
					   sleep(5);
					   
					  
					   actions.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
					
					   //months Extra in Diamond jewel
					   
					   sleep(2);
					   driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[2]/div/ng-select/div/div/div[2]/input")).sendKeys("2 months");
					    
					  
				       	actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
				           sleep(5);
				           actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
			         
	      //Discount VA
	          sleep(2);
		       driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[3]/div[1]/ng-select/div/div/div[2]/input")).sendKeys("Flat (%)");
					
				
					actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
			 sleep(5);
			 actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
				         
		   driver.findElement(By.xpath("//*[@id=\"mat-checkbox-8\"]/label/span[1]")).click();
			           
		   driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[3]/div[2]/input")).sendKeys("23");
		   driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[3]/div[3]/input")).sendKeys("23");

		   //Making Charges
        sleep(2);
        driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[4]/div/input")).sendKeys("32");
        //discount on stone charges
        driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[5]/div[1]/ng-select/div/div/div[2]/input")).sendKeys("Apply to All Stones");
        sleep(2);
        
	       	actions	.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
	           sleep(5);
	           actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
	           
	           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[5]/div[2]/input")).sendKeys("32");

	           //Diamond Charges
	           
	           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[6]/div/ng-select/div/div/div[2]/input")).sendKeys("Apply to All Diamonds");
	           sleep(2);
	           
		       	actions	.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		           sleep(5);
		           actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
		           
		     //Percentage
		       
		           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[7]/div[1]/ng-select/div/div/div[2]/input")).sendKeys("Percentage (%)");
		           sleep(2);
			       	actions	.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
			           sleep(5);
			           actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
			  
			  //Flat
			           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[7]/div[2]/input")).sendKeys("21");
			           
			           actions.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
			           
			           ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
					  
			           //First month bonus
			           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[5]/div/div[2]/div/ng-select/div/div/div[2]/input")).sendKeys("Yes");
			           sleep(2);
				       	actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
				           sleep(5);
				           actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
				           
				       //Amount
				           sleep(2);
				           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[5]/div/div[2]/div[2]/input")).sendKeys("100");
				    
				     //Quit Details
				           
				           //Cash
				           sleep(2);
				           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[2]/div/ng-select/div/div/div[3]/input")).sendKeys("yes");
				           sleep(2);
					       	actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
					           sleep(3);
					           actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
					           actions.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
					           sleep(2);
					           ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
		//Gold Jewellery
		// Month Wise	
		 // Bonus Per Month
	 //1st Month
	 driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[5]/div/div[1]/div/div[2]/input")).sendKeys("1");
	  sleep(2);
	  
	//2st Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("2").keyUp(Keys.TAB).perform();
	  sleep(1);			           

	//3rd Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("3").keyUp(Keys.TAB).perform();
	  sleep(1);
	  
	//4th Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("4").keyUp(Keys.TAB).perform();
	  sleep(1);
	  
	//5th Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("5").keyUp(Keys.TAB).perform();
	  sleep(1);
	  
	//6th Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("6").keyUp(Keys.TAB).perform();
	  sleep(1);
	  
	//7th Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("7").keyUp(Keys.TAB).perform();
	  sleep(1);
	  
	//8th Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("8").keyUp(Keys.TAB).perform();
	  sleep(1);
	  
	//9th Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("9").keyUp(Keys.TAB).perform();
	  sleep(5);	  
	
	//Copy To
	driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[3]/div[2]/button")).click();
	sleep(4);
	//Diamond click
	driver.findElement(By.xpath("//*[@id=\"mat-checkbox-9\"]/label/span[2]/span[2]")).click();
	sleep(4);
	//Submit
	driver.findElement(By.xpath("//*[@id=\"kt_body\"]/ngb-modal-window/div/div/app-copy-bonus-percentage/div[2]/div[2]/button")).click();
	sleep(1);
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)");
	sleep(4);
	
	//Product
	
	driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[6]/div/ng-select/div/span")).click();
	
	
	sleep(2);
//	driver.findElement(By.xpath("//div[@aria-expanded='true']//input[@type='text']")).sendKeys("Yes");

	sleep(2);
	actions.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
	sleep(2);
	actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
 actions.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
 sleep(2);
	//Bonus % per month Wise

	//1st Month
	driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[1]/div/div[2]/input")).sendKeys("1");
	 sleep(1);	
	
	//2st Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("2").keyUp(Keys.TAB).perform();
	  sleep(1);			           

	//3rd Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("3").keyUp(Keys.TAB).perform();
	  sleep(1);
	  
	//4th Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("4").keyUp(Keys.TAB).perform();
	  sleep(1);
	  
	//5th Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("5").keyUp(Keys.TAB).perform();
	  sleep(1);
	  
	//6th Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("6").keyUp(Keys.TAB).perform();
	  sleep(1);
	  
	//7th Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("7").keyUp(Keys.TAB).perform();
	  sleep(1);
	  
	//8th Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("8").keyUp(Keys.TAB).perform();
	  sleep(1);
	  
	//9th Month
	  actions.keyDown(Keys.TAB).pause(1000).sendKeys("9").keyUp(Keys.TAB).perform();
	  sleep(5);	  
	  
	//Copy To
	  driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[7]/div[2]/button")).click();
	  sleep(4);
	  //Diamond click
	  driver.findElement(By.xpath("//*[@id=\"mat-checkbox-10\"]/label/span[1]")).click();
	  sleep(5);
	  //Submit
	  driver.findElement(By.xpath("//*[@id=\"kt_body\"]/ngb-modal-window/div/div/app-copy-bonus-percentage/div[2]/div[2]/button")).click();
	  
	 
	 //Discount in VA
	  
	  driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[8]/div/div/label[2]")).click();
	  
	//1st Month
		driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[1]/div/div[2]/input")).sendKeys("1");
		 sleep(1);	
		
		//2st Month
		  actions.keyDown(Keys.TAB).pause(1000).sendKeys("2").keyUp(Keys.TAB).perform();
		  sleep(1);			           

		//3rd Month
		  actions.keyDown(Keys.TAB).pause(1000).sendKeys("3").keyUp(Keys.TAB).perform();
		  sleep(1);
		  
		//4th Month
		  actions.keyDown(Keys.TAB).pause(1000).sendKeys("4").keyUp(Keys.TAB).perform();
		  sleep(1);
		  
		//5th Month
		  actions.keyDown(Keys.TAB).pause(1000).sendKeys("5").keyUp(Keys.TAB).perform();
		  sleep(1);
		  
		//6th Month
		  actions.keyDown(Keys.TAB).pause(1000).sendKeys("6").keyUp(Keys.TAB).perform();
		  sleep(1);
		  
		//7th Month
		  actions.keyDown(Keys.TAB).pause(1000).sendKeys("7").keyUp(Keys.TAB).perform();
		  sleep(1);
		  
		//8th Month
		  actions.keyDown(Keys.TAB).pause(1000).sendKeys("8").keyUp(Keys.TAB).perform();
		  sleep(1);
		  
		//9th Month
		  actions.keyDown(Keys.TAB).pause(1000).sendKeys("9").keyUp(Keys.TAB).perform();
		  sleep(5);	  
		  
		  //copyTo
		  driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[7]/div[2]/button")).click();
		  sleep(4);
		  //Diamond click
		  driver.findElement(By.xpath("//*[@id=\"mat-checkbox-11\"]/label/span[1]")).click();
		  sleep(5);
		  //Submit
		  driver.findElement(By.xpath("//*[@id=\"kt_body\"]/ngb-modal-window/div/div/app-copy-bonus-percentage/div[2]/div[2]/button")).click();
		
		  
		  //Discount in making Charges
		  
		  driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[8]/div/div/label[3]")).click();
		  
		//1st Month
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[1]/div/div[2]/input")).sendKeys("1");
			 sleep(1);	
			
			//2st Month
			  actions.keyDown(Keys.TAB).pause(1000).sendKeys("2").keyUp(Keys.TAB).perform();
			  sleep(1);			           

			//3rd Month
			  actions.keyDown(Keys.TAB).pause(1000).sendKeys("3").keyUp(Keys.TAB).perform();
			  sleep(1);
			  
			//4th Month
			  actions.keyDown(Keys.TAB).pause(1000).sendKeys("4").keyUp(Keys.TAB).perform();
			  sleep(1);
			  
			//5th Month
			  actions.keyDown(Keys.TAB).pause(1000).sendKeys("5").keyUp(Keys.TAB).perform();
			  sleep(1);
			  
			//6th Month
			  actions.keyDown(Keys.TAB).pause(1000).sendKeys("6").keyUp(Keys.TAB).perform();
			  sleep(1);
			  
			//7th Month
			  actions.keyDown(Keys.TAB).pause(1000).sendKeys("7").keyUp(Keys.TAB).perform();
			  sleep(1);
			  
			//8th Month
			  actions.keyDown(Keys.TAB).pause(1000).sendKeys("8").keyUp(Keys.TAB).perform();
			  sleep(1);
			  
			//9th Month
			  actions.keyDown(Keys.TAB).pause(1000).sendKeys("9").keyUp(Keys.TAB).perform();
			  sleep(5);	  
			  
			  //copyTo
			  driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[7]/div[2]/button")).click();
			  sleep(4);
			  //Diamond click
			  driver.findElement(By.xpath("//*[@id=\"mat-checkbox-12\"]/label/span[1]")).click();
			  sleep(5);
			  //Submit
			  driver.findElement(By.xpath("//*[@id=\"kt_body\"]/ngb-modal-window/div/div/app-copy-bonus-percentage/div[2]/div[2]/button")).click();
			
	  //Discount in stone Charges
			  
			  driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[8]/div/div/label[4]")).click();
			  
			//1st Month
				driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[1]/div/div[2]/input")).sendKeys("1");
				 sleep(1);	
				
				//2st Month
				  actions.keyDown(Keys.TAB).pause(1000).sendKeys("2").keyUp(Keys.TAB).perform();
				  sleep(1);			           

				//3rd Month
				  actions.keyDown(Keys.TAB).pause(1000).sendKeys("3").keyUp(Keys.TAB).perform();
				  sleep(1);
				  
				//4th Month
				  actions.keyDown(Keys.TAB).pause(1000).sendKeys("4").keyUp(Keys.TAB).perform();
				  sleep(1);
				  
				//5th Month
				  actions.keyDown(Keys.TAB).pause(1000).sendKeys("5").keyUp(Keys.TAB).perform();
				  sleep(1);
				  
				//6th Month
				  actions.keyDown(Keys.TAB).pause(1000).sendKeys("6").keyUp(Keys.TAB).perform();
				  sleep(1);
				  
				//7th Month
				  actions.keyDown(Keys.TAB).pause(1000).sendKeys("7").keyUp(Keys.TAB).perform();
				  sleep(1);
				  
				//8th Month
				  actions.keyDown(Keys.TAB).pause(1000).sendKeys("8").keyUp(Keys.TAB).perform();
				  sleep(1);
				  
				//9th Month
				  actions.keyDown(Keys.TAB).pause(1000).sendKeys("9").keyUp(Keys.TAB).perform();
				  sleep(5);	  
				  
				  //copyTo
				  driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[7]/div[2]/button")).click();
				  sleep(4);
				  //Diamond click
				  driver.findElement(By.xpath("//*[@id=\"mat-checkbox-13\"]/label/span[1]")).click();
				  sleep(5);
				  //Submit
				  driver.findElement(By.xpath("//*[@id=\"kt_body\"]/ngb-modal-window/div/div/app-copy-bonus-percentage/div[2]/div[2]/button")).click();
				
				  
				  //Diamond Jewellery
				  
				  //Discount in diamond charges
				  
				  driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[7]/div[1]/div/label[2]")).click();
				  driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[8]/div/div/label[5]")).click();

				  
				//1st Month
					driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[1]/div/div[2]/input")).sendKeys("1");
					 sleep(1);	
					
					//2st Month
					  actions.keyDown(Keys.TAB).pause(1000).sendKeys("2").keyUp(Keys.TAB).perform();
					  sleep(1);			           

					//3rd Month
					  actions.keyDown(Keys.TAB).pause(1000).sendKeys("3").keyUp(Keys.TAB).perform();
					  sleep(1);
					  
					//4th Month
					  actions.keyDown(Keys.TAB).pause(1000).sendKeys("4").keyUp(Keys.TAB).perform();
					  sleep(1);
					  
					//5th Month
					  actions.keyDown(Keys.TAB).pause(1000).sendKeys("5").keyUp(Keys.TAB).perform();
					  sleep(1);
					  
					//6th Month
					  actions.keyDown(Keys.TAB).pause(1000).sendKeys("6").keyUp(Keys.TAB).perform();
					  sleep(1);
					  
					//7th Month
					  actions.keyDown(Keys.TAB).pause(1000).sendKeys("7").keyUp(Keys.TAB).perform();
					  sleep(1);
					  
					//8th Month
					  actions.keyDown(Keys.TAB).pause(1000).sendKeys("8").keyUp(Keys.TAB).perform();
					  sleep(1);
					  
					//9th Month
					  actions.keyDown(Keys.TAB).pause(1000).sendKeys("9").keyUp(Keys.TAB).perform();
					  sleep(5);	  
					  
					  //copyTo
					  driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[7]/div[2]/button")).click();
					  sleep(4);
					  //Diamond click
				//	  driver.findElement(By.xpath("//*[@id=\"mat-checkbox-13\"]/label/span[1]")).click();
				//	  sleep(5);
					  //Submit
					  driver.findElement(By.xpath("//*[@id=\"kt_body\"]/ngb-modal-window/div/div/app-copy-bonus-percentage/div[2]/div/button")).click();
					
					   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)");
		  
		//Terms and conditions
			   
		      driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]/span[2]")).click();
		   //   actions.sendKeys(Keys.ESCAPE).perform();
		      ((JavascriptExecutor)driver).executeScript("document.body.click()");
		  //Create Scheme Button
       sleep(2);
		  driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/section/div/div/div/button")).click();

}    

	
	
}
