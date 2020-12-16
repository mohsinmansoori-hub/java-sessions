package testngSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {
	//output---->//login
	             //home page search
	              //homepage user info
	
	//if the login condition fail both the testcases will fail..
	@Test
	public void loginTest() {
		System.out.println("login");
		//int i=9/0;
		// Tests run: 3, Failures: 1, Skips: 2
	}
	@Test(dependsOnMethods= "loginTest")
	public void homepageSearchTest() {
		System.out.println("home page search");
	}
@Test(dependsOnMethods="loginTest")
public void homepageuserinfoTest() {
	System.out.println("homepage user info");
}
}
 