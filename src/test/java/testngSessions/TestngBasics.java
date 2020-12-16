package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {
	
	//testng-unit testing framework
	//it is used to design,maintain and run test cases
	// use annotation to write test steps and test cases
	// there will be a pair of before method,@test,after method.
	//before every @test BeforeMethod will run,ND afterMethod  will be run after @test.
	
	
	@BeforeSuite
	public void createDb() {
		System.out.println("BF----connect db");
	}
	@BeforeTest
	public void createuserinDb() {
		
		System.out.println("BT---create user in db");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
	System.out.println("BC-----launch browser");	
	}
	
	
	@BeforeMethod
	public void login() {
		System.out.println("BM----login");
	}
	
	@Test
	public void verifypage() {
		System.out.println("verify page");
	}
	@Test
	public void gettext() {
		System.out.println("gettext");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("AM----logout");
	}
	
	
	
	@AfterClass
	public void closebrowser() {
		System.out.println("browser closed");
}
	@AfterTest
	public void deleteUser() {
		System.out.println("AT----user deleted");
	}
	@AfterSuite
	public void disconnectdb() {
		System.out.println("AS----- db disconnected");
	}
	
}