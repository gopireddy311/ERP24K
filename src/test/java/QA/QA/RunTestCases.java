package QA.QA;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class RunTestCases extends OpeningBrowser {
  @Test
  public void toRunTestCases() throws InterruptedException, IOException, AWTException {
	  
	  ScriptingCode code = new ScriptingCode();
	    code.login();
	    code.dashboard();
//	   code.Estimation();
//	   code.more();
//	    code.master();
//	    code.addPurity();
//	   code.price();
	    code.Scheme();
	    //code.Manju();
	  
	  
	  
  }
}
