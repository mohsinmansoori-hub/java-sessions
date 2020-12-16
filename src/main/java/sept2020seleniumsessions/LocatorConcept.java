package sept2020seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
static	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
	
	//create webelement+action(click,sendkeys,get text)
		//1. id=unique locator
	 driver=new ChromeDriver();
	driver.get("https://app.hubspot.com");
	Thread.sleep(7000);
	/**
	 * first approach
	 */
	//driver.findElement(By.id("username")).sendKeys("mohsin@123");
	//driver.findElement(By.id("password")).sendKeys("mohsin123");
	//by is the class and id is the static method
	//driver.findElement(By.id("loginBtn")).click();
	
	
	/**
	 * second approach
	 */
	// WebElement email=driver.findElement(By.id("username"));
	//WebElement pwd= driver.findElement(By.id("password"));
	//WebElement login=driver.findElement(By.id("loginBtn"));
	
	//email.sendKeys("mohsin@gmail.com");
	//pwd.sendKeys("mohsin");
	//login.click();
	 
	/**
	 * third approach
	 */
	By email=By.id("username");
	By pwd=By.id("password");
	By login=By.id("loginBtn");
	
	//WebElement email_ele=driver.findElement(email);
	//WebElement pwd_ele=driver.findElement(pwd);
	//WebElement login_ele=driver.findElement(login);
	
	//email_ele.sendKeys("mohsin@gmail.com");
	//pwd_ele.sendKeys("mohsin123");
	//login_ele.click();
	  /**
	   * 4th approach		
	   */
	
//getelement(email).sendKeys("mohsin@gmail.com");
//getelement(pwd).sendKeys("abc");
//getelement(login).click();
	
	/**
	 * 5th approach
	 */
dosendkeys(email, "mohsin@gmail");
dosendkeys(pwd, "abc123");
getclick(login);

	}
	public static WebElement getelement(By locator) {
	return driver.findElement(locator);
		
	}
	public static void  dosendkeys(By locator,String value) {
		getelement(locator).sendKeys(value);
		
	}
	public static void  getclick(By locator) {
		 getelement(locator).click();;
		
	}
	
	

}
