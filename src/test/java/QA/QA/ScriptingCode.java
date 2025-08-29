package QA.QA;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScriptingCode extends ReusedMethods{
	
	public void login() throws InterruptedException, IOException
	{         //........... LOGIN ........                      //........... LOGIN ........
		
	driver.get("https://erpqa.azurewebsites.net/auth/login");
	screenshot("login page 1");
    sleep(2);
	Actions action = new Actions (driver);

	driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("Gopireddy");
	 sleep(2);
	action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	 sleep(2);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password@123");
	 sleep(2);
	action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	 sleep(2);
	driver.findElement(By.xpath("//input[@formcontrolname='captcha']")).sendKeys("123456");
	 sleep(2);
	screenshot("Valid Credentials 2");
	 sleep(2);
	action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	 sleep(2);
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	screenshot("Home page 3");
	 sleep(2);
	action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	 sleep(2);
	}         //........... LOGIN ........                      //........... LOGIN ........
	
	public void master() throws InterruptedException, IOException
	{        //........... MASTER ........                      //........... MASTER ........
		 sleep(2);
		WebElement moreElement = driver.findElement(By.xpath("//span[text()='More']"));
		sleep(2);
		Actions action = new Actions(driver);
		action.moveToElement(moreElement).pause(2000).click().build().perform();
		screenshot("More 4");
		sleep(2);             
	//	action.moveToElement(driver.findElement(By.xpath("//span[text()='More']"))).pause(2000).click().build().perform();
	
	}       //........... MASTER ........                      //........... MASTER ........

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
	
	
	
}
