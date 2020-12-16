package sept2020seleniumsessions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
 
class ActionsclassConcept {
	static WebDriver driver;
	public static void main (String args[]) throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("http://app.hubspot.com/");
		Thread.sleep(7000);
		
		
		By email=By.id("username");
		By password=By.id("password");
		By login=By.id("loginBtn");
		
		
		
		doactionsSendKeys(email, "test@123");
		doactionsSendKeys(password, "test123");
		doactionsClick(login); 
		Actions act=new Actions(driver);
		act.doubleClick();//double click at the element
		act.moveToElement(driver.findElement(email)).sendKeys("mohsin").build().perform();
		
	//	act.sendKeys(driver.findElement(email), "test@123").perform();
	//	act.sendKeys(driver.findElement(password),"mohsin@123").perform();
	}
	public static WebElement getelement(By locator) {
		return driver.findElement(locator);
	}
	public static void doactionsSendKeys(By locator,String value) {
		Actions action=new Actions(driver);
		action.sendKeys(getelement(locator), value).perform();
		
	}
	public static  void doactionsClick(By locator) {
		Actions actions=new Actions(driver);
		actions.click(getelement(locator)).perform();
	}
	public static void movetoelementactions(By locator,String value) {
		Actions a=new Actions(driver);
		a.moveToElement(getelement(locator)).sendKeys(value).build().perform();
	}
	public static void doclickmovetoelementactions(By locator) {
		Actions a= new Actions(driver);
		a.moveToElement(getelement(locator)).click().build().perform();
	}
	
	

}
