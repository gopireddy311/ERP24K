package QA.QA;

import java.io.IOException;

import org.testng.annotations.Test;

public class RunTestCases extends OpeningBrowser {
  @Test
  public void toRunTestCases() throws InterruptedException, IOException {
	  
	  ScriptingCode code = new ScriptingCode();
	    code.login();
	//  code.master();
	    code.price();
	  
	  
	  
  }
}
