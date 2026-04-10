package ListenerInTestNg;

import org.testng.annotations.Test;

public class TestCases extends ListnerTestng {
  @Test
  public void abcTestCase() {
	  System.out.println("testcase method abcTestcase is called ");
	  
  }
  @Test
  public void xyzTestCase() {
	  int i=10/0;
	  System.out.println("xyzTestCase");
	  System.out.println("testcase method xyzTestcase is called");
	  
  }
}