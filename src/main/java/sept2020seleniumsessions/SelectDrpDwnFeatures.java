package sept2020seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDrpDwnFeatures {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.linkText("FREE 30 Day Trial")).click();;
		Thread.sleep(4000);
		
		By industry=By.id("Form_submitForm_Industry");
		By country=By.id("Form_submitForm_Country");
		//Select select=new Select(driver.findElement(country));
		//List <WebElement> element=select.getOptions();
		//System.out.println(element.size());
		
	//	for(WebElement ele:element ) {
		//System.out.println(ele.getText());
		 
		//}
	List<String> getlist=	dogetdrpdownOptions(industry);
	System.out.println(getlist.size());
	for(String gettext:getlist) {
		System.out.println(gettext);
		
	}
		
		
			}
	public static WebElement getelement(By locator) {
		return driver.findElement(locator);
		
	}
	public static List<String> dogetdrpdownOptions(By locator) {
		List <String>dropdownlist=new ArrayList<String>();
		Select select=new Select(getelement(locator));
		List <WebElement>drpdownoptionselement=select.getOptions();
		for(WebElement ele:drpdownoptionselement) {
			String text=ele.getText();
			dropdownlist.add(text);
			
		}
		return dropdownlist;
		
		
	}

	

}
