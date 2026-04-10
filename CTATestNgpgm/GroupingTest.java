package CTATestNgpgm;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingTest {
  @Test(groups = "smoke group")
  public void smoke() {
	  Reporter.log("smoke test" +true);
	  
  }
  @Test(groups="smoke1 group")
  public void smoke1() {
	  Reporter.log("smoke test1");
  }
  
  @Test(groups="smoke2 group")
  public void smoke2() {
	  Reporter.log("smoke test2"+true);
  }
  
  @Test(groups = "smoke3 group")
  public void smoke3() {
	  Reporter.log("smoke test3");
  }
  
}
