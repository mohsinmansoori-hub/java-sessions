package sept2020seleniumsessions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectwithoutdropdown {
     static WebDriver driver;
	    public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.linkText("FREE 30 Day Trial")).click();;
		Thread.sleep(4000);
		
		List <WebElement>empele=driver.findElements(By.xpath("//select[@id='Form_submitForm_NoOfEmployees']/option"));
System.out.println(empele.size());
for(WebElement empgettext:empele) {
String text=empgettext.getText();
if(text.equals("51 - 75")) {
	empgettext.click();
	break;
}
}


	}

}
