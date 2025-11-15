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
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/div/div/form/div/div[1]/ng-select/div/div/div[2]/input")).sendKeys("Savings");;
			sleep(2);
         
           Actions Savings=new Actions(driver);
       	Thread.sleep(2);
           Savings.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
           sleep(2);
          Savings.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();

			driver.findElement(By.xpath("//input[@placeholder='Enter scheme name']")).sendKeys("gold loan");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[2]/div[2]/input")).sendKeys("9");
         
//	    	//Date Picker

			//Select the Scheme Start Date 
			// Click on the date icon    
			
			Actions SchemeStartDate=new Actions(driver); 
		SchemeStartDate.moveToElement(driver.findElement(By.xpath("//span[@class='mat-button-wrapper']//*[name()='svg']"))).pause(2).click().build().perform(); 
		sleep(1); 
	    // Click on the full date (13/11/2025)dropdown       
			   SchemeStartDate.moveToElement(driver.findElement(By.xpath("//button[contains(@class,'mat-calendar-period-button')]"))).pause(2).click().build().perform();
			   sleep(1); 
        //Click on the year
			 SchemeStartDate.moveToElement(driver.findElement(By.xpath("//div[text()=' 2025 ']"))).pause(2).click().build().perform(); 
	          sleep(1);
	   //click on the Month
			    SchemeStartDate.moveToElement(driver.findElement(By.xpath("//div[text()=' SEPT ']"))).pause(2).click().build().perform(); 
			   sleep(1); 
			   //Click on the Day
			    SchemeStartDate.moveToElement(driver.findElement(By.xpath("//div[text()=' 1 ']"))).pause(2).click().build().perform(); 
			   sleep(2);
			 
			Thread.sleep(2000);
			//MemberShip Limit
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[2]/div[4]/input")).sendKeys("12");
			//Monthly Saving
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[3]/div[1]/input")).sendKeys("10");
			//max monthly Saving
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[3]/div[2]/input")).sendKeys("10000");
			//paying out period
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[3]/div[3]/input")).sendKeys("1");
			//instant pay out
			Thread.sleep(1000);
			WebElement Pay=driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[1]/div/div/div[3]/div[4]/ng-select/div/span"));
			Pay.click();
			//Thread.sleep(2000);
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(7));
	    	WebElement Yes=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ng-option-label ng-star-inserted']")));
		    Thread.sleep(5000);
		    
		    Yes.click();
		  //  Late Payment details
		WebElement details=    driver.findElement(By.xpath("//div//input[@id='isLatePaymentDetails']"));
		details.click();
		    sleep(2);
		    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");
		    sleep(2);
		    driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[2]/div/div/div[2]/div[1]/input")).sendKeys("5");
		    driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[2]/div/div/div[2]/div[2]/input")).sendKeys("9.89");

		    //Validation Condition
		
		    sleep(5);
		 driver.findElement(By.xpath("//div[@id='mat-select-value-1']")).click();
			sleep(2);
         
           Actions vadDropdown=new Actions(driver);
         vadDropdown.moveToElement(driver.findElement(By.xpath("//span[text()=' Gold ']"))).pause(5).click().perform();
         sleep(2);
		    Actions Ac=new Actions(driver);
		    Ac.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
		//    ((JavascriptExecutor)driver).executeScript("document.body.click()");//To close the dropdown
		 
		    //Gold Purity
		    sleep(2);
		 WebElement Purity=   driver.findElement(By.xpath("//span[text()='Select Purities']"));////*[@id="mat-select-6"]/div/div[2]/div
		    sleep(2);
	     Purity.click();
			
	     Actions SelectAll=new Actions(driver);
	     SelectAll.moveToElement(driver.findElement(By.xpath("//span[text()='Select All']"))).pause(5).click().perform();
         sleep(2);
		    Actions A=new Actions(driver);
		    A.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
		//    ((JavascriptExecutor)driver).executeScript("document.body.click()");//To close the dropdown
		    
		    sleep(2);
		    
		    //Diamond CheckBox
		    
		WebElement Diamond=    driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']"));

			sleep(2);
			Diamond.click();
			
			WebElement Selectgroup=driver.findElement(By.xpath("//span[text()='Select group']"));
			sleep(2);
			Selectgroup.click();
			
			sleep(2);
			
		     Actions DPurity=new Actions(driver);
		    DPurity.moveToElement(driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='Gold']"))).pause(5).click().perform();
	         sleep(2);
	       Actions B=new Actions(driver);
	       B.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
			//    ((JavascriptExecutor)driver).executeScript("document.body.click()");//To close the dropdown
			    
    //Gold Purity in diamond
			    sleep(5);
		    WebElement GP=	driver.findElement(By.xpath("//span[text()='Select Purities']"));
		    sleep(5);
		    GP.click();
		    
		    sleep(5);
		    Actions gold=new Actions(driver);
		    gold.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Select All']"))).pause(10).click().perform();
	         sleep(5);
		   Actions c=new Actions(driver);
		   c.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
			//    ((JavascriptExecutor)driver).executeScript("document.body.click()");//To close the dropdown
		//   sleep(2);
		//   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");

			 
          //Scheme Benefits
		   
		     //Bonus
		   sleep(8);
		   WebElement BonusType=driver.findElement(By.xpath("//*[@id=\"mat-select-value-5\"]/span"));
		  
		   sleep(2);
		  
			BonusType.click();
			sleep(2);
		//   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");

	
		   sleep(3);
		   Actions MonthAll=new Actions(driver);
		   MonthAll.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-checkbox-4\"]/label/span[2]/span[2]"))).pause(5).click().perform();
		   sleep(5);
		   
		   Actions D=new Actions(driver);
		   D.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
		   
		     //Months Extra
		   sleep(2);
		   driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[1]/div/div[2]/div/ng-select/div/div/div[2]/input")).sendKeys("2 months");
		    
		   Actions ExtraMonths=new Actions(driver);
	       	Thread.sleep(5000);
	       	ExtraMonths.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
	           sleep(5);
	           ExtraMonths.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
         
	           //Discount VA
	           sleep(2);
	           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[1]/div/div[3]/div[1]/ng-select/div/div/div[2]/input")).sendKeys("Percentage");
		
	           Actions Percentage=new Actions(driver);
		       	Thread.sleep(5000);
		       	Percentage.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		           sleep(5);
		           Percentage.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
	         
		           //discount Upto
		           sleep(2);
		           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[1]/div/div[3]/div[2]/input")).sendKeys("34");
			
                   //Making Charges
		           sleep(2);
		           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[1]/div/div[4]/div/input")).sendKeys("23");
		           //discount on stone charges
		           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[1]/div/div[5]/div[1]/ng-select/div/div/div[2]/input")).sendKeys("Apply to All Stones");
		           sleep(2);
		           Actions Stone=new Actions(driver);
			       	Thread.sleep(5000);
			       	Stone.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
			           sleep(5);
			           Stone.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
			           
			           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[1]/div/div[5]/div[2]/input")).sendKeys("32");
			           
			           //Diamond Jewellery
			           
			             //bonus Type
			           WebElement type=driver.findElement(By.xpath("//*[@id=\"mat-select-value-9\"]/span"));
			           sleep(2);
			           type.click();
			           
			           sleep(3);
					   Actions Select=new Actions(driver);
					   Select.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-checkbox-6\"]/label/span[2]/span[2]"))).pause(5).click().perform();
					   sleep(5);
					   
					   Actions E=new Actions(driver);
					   E.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
					
					   //months Extra in Diamond jewel
					   
					   sleep(2);
					   driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[2]/div/ng-select/div/div/div[2]/input")).sendKeys("2 months");
					    
					   Actions XtraMonths=new Actions(driver);
				       	sleep(5);
				       	XtraMonths.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
				           sleep(5);
				           XtraMonths.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
			         
	      //Discount VA
	          sleep(2);
		       driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[3]/div[1]/ng-select/div/div/div[2]/input")).sendKeys("Flat (%)");
					
				 Actions Flat=new Actions(driver);
				 
					sleep(5);
	       	Flat.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
			 sleep(5);
		   Flat.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
				         
		   driver.findElement(By.xpath("//*[@id=\"mat-checkbox-8\"]/label/span[1]")).click();
			           
		   driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[3]/div[2]/input")).sendKeys("23");
		   driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[3]/div[3]/input")).sendKeys("23");

		   //Making Charges
           sleep(2);
           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[4]/div/input")).sendKeys("32");
           //discount on stone charges
           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[5]/div[1]/ng-select/div/div/div[2]/input")).sendKeys("Apply to All Stones");
           sleep(2);
           Actions Charges=new Actions(driver);
	       	Thread.sleep(5000);
	       	Charges	.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
	           sleep(5);
	           Charges.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
	           
	           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[5]/div[2]/input")).sendKeys("32");

	           //Diamond Charges
	           
	           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[6]/div/ng-select/div/div/div[2]/input")).sendKeys("Apply to All Diamonds");
	           sleep(2);
	           Actions DCharges=new Actions(driver);
		       	Thread.sleep(5000);
		       	DCharges	.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		           sleep(5);
		           DCharges.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
		           
		     //Percentage
		       
		           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[7]/div[1]/ng-select/div/div/div[2]/input")).sendKeys("Percentage (%)");
		           sleep(2);
		           Actions Percent=new Actions(driver);
			       	Thread.sleep(5000);
			       	Percent	.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
			           sleep(5);
			           Percent.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
			  
			  //Flat
			           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[4]/app-saving-scheme-benefits/div/div/div[2]/div[2]/div/div[7]/div[2]/input")).sendKeys("21");
			           
			           Actions F=new Actions(driver);
					   F.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
					   
					   //First month bonus
					   
					   
			           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[5]/div/div[2]/div/ng-select/div/div/div[2]/input")).sendKeys("Yes");
			           sleep(2);
			           Actions bonus=new Actions(driver);
				       	Thread.sleep(5000);
				       	bonus.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
				           sleep(5);
				           bonus.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
				           
				       //Amount
				           sleep(2);
				           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[5]/div/div[2]/div[2]/input")).sendKeys("100");
				    
				     //Quit Details
				           
				           //Cash
				           sleep(2);
				           driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[2]/div/ng-select/div/div/div[3]/input")).sendKeys("yes");
				           sleep(2);
				           Actions Cash=new Actions(driver);
					       	Thread.sleep(5000);
					       	Cash.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
					           sleep(5);
					           Cash.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
					           
					           Actions G=new Actions(driver);
							   G.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
							 
					           
					         	   
			//Bonus % per month 
								   
				  //1st Month
						
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[5]/div/div[1]/div/div[2]/input")).sendKeys("1");
					
				  //2nd Month
		
driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[5]/div/div[2]/div/div[2]/input")).sendKeys("2");
			
			     //3rd Month
			
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[5]/div/div[3]/div/div[2]/input")).sendKeys("3");
					
		    	  //4th Month
					
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[5]/div/div[4]/div/div[2]/input")).sendKeys("4");
					
					  //5th Month
					
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[5]/div/div[5]/div/div[2]/input")).sendKeys("5");
					
					  //6th Month
					
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[5]/div/div[6]/div/div[2]/input")).sendKeys("6");
					
					  //7th Month
					
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[5]/div/div[7]/div/div[2]/input")).sendKeys("7");
					
					  //8th Month
					
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[5]/div/div[8]/div/div[2]/input")).sendKeys("8");
					
					  //9th Month
					
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[5]/div/div[9]/div/div[2]/input")).sendKeys("9");
			
			sleep(5);
			//Copy To
			driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[3]/div[2]/button")).click();
			sleep(4);
			//Diamond click
			driver.findElement(By.xpath("//*[@id=\"mat-checkbox-9\"]/label/span[2]/span[2]")).click();
			sleep(4);
			//Submit
			driver.findElement(By.xpath("//*[@id=\"kt_body\"]/ngb-modal-window/div/div/app-copy-bonus-percentage/div[2]/div[2]/button")).click();
			
	  //Product
			
	           sleep(5);
	         driver.findElement(By.xpath("//div[text()='Select is quit option available for product']")).sendKeys("Yes");
	        
	           sleep(2);
	           Actions Product=new Actions(driver);
		       sleep(5);
		       	Product.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		           sleep(5);
		           Product.keyDown(Keys.ENTER).keyUp(Keys.ENTER).click().perform();
		          
		           Actions I=new Actions(driver);
				   I.sendKeys(Keys.ESCAPE).perform();//To close the dropdown
				   
		//Bonus % per month Wise
				   
					  //1st Month
							
				driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[1]/div/div[2]/input")).sendKeys("1");
						
					  //2nd Month
						
				driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[2]/div/div[2]/input")).sendKeys("2");
				
				     //3rd Month
				
				driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[3]/div/div[2]/input")).sendKeys("3");
						
			    	  //4th Month
						
				driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[4]/div/div[2]/input")).sendKeys("4");
						
						  //5th Month
						
				driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[5]/div/div[2]/input")).sendKeys("5");
						
						  //6th Month
						
				driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[6]/div/div[2]/input")).sendKeys("6");
						
						  //7th Month
						
				driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[7]/div/div[2]/input")).sendKeys("7");
						
						  //8th Month
						
				driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[8]/div/div[2]/input")).sendKeys("8");
						
						  //9th Month
						
				driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[9]/div/div[2]/input")).sendKeys("9");
				
				sleep(5);
				//Copy To
				driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[7]/div[2]/button")).click();
				sleep(4);
				//Diamond click
				driver.findElement(By.xpath("//*[@id=\"mat-checkbox-10\"]/label/span[2]/span[2]")).click();
				sleep(4);
				//Submit
				driver.findElement(By.xpath("//*[@id=\"kt_body\"]/ngb-modal-window/div/div/app-copy-bonus-percentage/div[2]/div[2]/button")).click();
				
			
			//Discount in VA
				
				driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[8]/div/div/label[2]")).click();
				  //1st Month
				
						driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[1]/div/div[2]/input")).sendKeys("1");
								
							  //2nd Month
								
						driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[2]/div/div[2]/input")).sendKeys("2");
						
						     //3rd Month
						
						driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[3]/div/div[2]/input")).sendKeys("3");
								
					    	  //4th Month
								
						driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[4]/div/div[2]/input")).sendKeys("4");
								
								  //5th Month
								
						driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[5]/div/div[2]/input")).sendKeys("5");
								
								  //6th Month
								
						driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[6]/div/div[2]/input")).sendKeys("6");
								
								  //7th Month
								
						driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[7]/div/div[2]/input")).sendKeys("7");
								
								  //8th Month
								
						driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[8]/div/div[2]/input")).sendKeys("8");
								
								  //9th Month
								
						driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[9]/div/div[9]/div/div[2]/input")).sendKeys("9");
				
						sleep(5);
						//Copy To
						driver.findElement(By.xpath("//*[@id=\"kt_content_container\"]/app-schemes/div[2]/app-create-schemes/app-saving/form/section[6]/app-saving-quit-option/div/div/div[7]/div[2]/button")).click();
						sleep(4);
						//Diamond click
						driver.findElement(By.xpath("//*[@id=\"mat-checkbox-11\"]/label/span[2]/span[2]")).click();
						sleep(4);
						//Submit
						driver.findElement(By.xpath("//*[@id=\"kt_body\"]/ngb-modal-window/div/div/app-copy-bonus-percentage/div[2]/div[2]/button")).click();
						
						//Discount In Making Charges
						
				
   }

	
	
}
