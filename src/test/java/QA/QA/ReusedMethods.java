package QA.QA;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ReusedMethods extends RunTestCases {
  public void sleep(int toSleep) throws InterruptedException
  {
	  int toWait = toSleep*1000;
	  Thread.sleep(toWait);
  }
  
  public void screenshot(String sc) throws IOException 
  {
	  File source =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File Target = new File("C:\\Users\\user\\eclipse-workspace\\QA\\src\\data\\java\\TEST PROOFS\\"+sc+".jpg");
	  FileHandler.copy(source, Target);
	  /*
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\gopir\\eclipse-workspace\\Submit_Vehicle_Insurance_quote\\Screenshot\\"+sc+".jpg");
		Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
	  	  */
  }
  
  
  
  public void printUsingRobot(String p) throws AWTException, IOException {
	    // Create Robot instance
	    Robot robot = new Robot();

	    // Get full screen size
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    Rectangle screenRect = new Rectangle(screenSize);

	    // Capture screen
	    BufferedImage screenCapture = robot.createScreenCapture(screenRect);

	    // Save screenshot to file
	    File file = new File("C:\\Users\\user\\eclipse-workspace\\QA\\src\\data\\java\\TEST PROOFS\\"+p+".png");
	    ImageIO.write(screenCapture, "png", file);
  }
}
