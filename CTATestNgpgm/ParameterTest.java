package CTATestNgpgm;

import org.testng.annotations.Parameters;
 
import org.testng.annotations.Test;

public class ParameterTest {
	@Parameters({"uid","pswd"})
	@Test
	public void login(String uid,String pswd) {
		System.out.println("userName: "+uid);
		System.out.println("password: "+pswd);
	}
	@Parameters({"abcid","abcpswd"})
	@Test
	public void ABCLogin(String abcid,String abcpswd) {
		System.out.println("userName: "+abcid);
		System.out.println("password: "+abcpswd);
	}

}
