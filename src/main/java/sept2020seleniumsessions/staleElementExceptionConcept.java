package sept2020seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class staleElementExceptionConcept {

	public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.orangehrm.com/");
	 
	WebElement link_ele= driver.findElement(By.linkText("FREE 30 Day Trial"));
	link_ele.click();
	Thread.sleep(3000);
	//v1 dom
	WebElement ele=driver.findElement(By.id("Form_submitForm_subdomain"));
	ele.sendKeys("abc");
	driver.navigate().refresh();
	//when we refresh dom gets updated,so we get stale element exception,to avoid this we need to create webelement again after refresh.
	//v2 dom
	Thread.sleep(3000);
	 ele=driver.findElement(By.id("Form_submitForm_subdomain"));
	ele.sendKeys("mohsin@123");
	 
	 
	 

	}

}
