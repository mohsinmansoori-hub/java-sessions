package testngSessions;

import org.testng.annotations.Test;

public class InvocationCount {
	//if we want to run a same test case many times then we use invocationCount.

	@Test(invocationCount=10)
	public void userlogin() {
	System.out.println("user login");	
	}
	
	
}
