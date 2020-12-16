package sept2020seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectdropdwn {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.linkText("FREE 30 Day Trial")).click();
		Thread.sleep(3000);
	//WebElement element=	driver.findElement(By.id("Form_submitForm_Industry"));
	//WebElement element1=	driver.findElement(By.id("Form_submitForm_Country"));
	
		//Select select=new Select(element);
	//	select.selectByVisibleText("Aerospace");
		//select.selectByIndex(2);//used where value doesnt matter.
		//select.selectByValue("health");
		
		
		
		//Select select1=new Select(element1);
		//select1.selectByVisibleText("Afghanistan");
		//System.out.println("drop down selected");
		
		By industrydrpdown=By.id("Form_submitForm_Industry");
		By countrydrpdwn=By.id("Form_submitForm_Country");
		
		DodropdownByVisibletext(industrydrpdown, "Aerospace");
		DodropdownByVisibletext(countrydrpdwn, "Afghanistan");
		
	}
	public static WebElement getelement(By locator) {
		return driver.findElement(locator);
	}
	public static void DodropdownByVisibletext(By locator, String text) {
		WebElement element=getelement(locator);
		Select select=new Select(element);
		select.selectByVisibleText(text);
		
	}
	public static void DodropdownByindex(By locator, int index) {
		WebElement element=getelement(locator);
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public static void DodropdownByvalue(By locator, String value) {
		WebElement element=getelement(locator);
		Select select=new Select(element);
		select.selectByValue(value);
	}

}
