package CTATestNgpgm;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
  @Test(dataProvider="dp")
  public void f(Integer n , String s,Double a) {
	  System.out.println("Integer n= "+n);
	  System.out.println("String s= "+s);
	  System.out.println("Float a= "+a);
  }
  
  @DataProvider
  public Object[][] dp(){
	  return new Object[][] {
		  new Object[] {1,"a",2.2},
		  new Object[] {2,"b",3.3},
		  new Object[] {3,"Nitin",4.4},
		  new Object[] {4,"Shweta",5.5},
		  new Object[] {5,"Pranjal",6.6}		  
	  };
  }
}
