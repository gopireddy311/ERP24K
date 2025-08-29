package QA.QA;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ReusedMethods extends RunTestCases {
  public void sleep(int toSleep) throws InterruptedException
  {
	  Thread.sleep(toSleep * 1000);
  }
  public void screenshot(String sc) throws IOException 
  {
	  File source =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File Target = new File("C:\\Users\\user\\eclipse-workspace\\QA\\src\\data\\java\\TEST PROOFS \\"+sc+".jpg");
	  FileHandler.copy(source, Target);
	  /*
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\gopir\\eclipse-workspace\\Submit_Vehicle_Insurance_quote\\Screenshot\\"+sc+".jpg");
		Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
	  	  */
  }
}
