package sept2020seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchlist {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("naveen automation labs");
		Thread.sleep(3000);
		List <WebElement>googlelist= driver.findElements(By.xpath("//ul[@class='erkvQe']/li//div[contains(@class,'sbl1')]//span"));
	
System.out.println(googlelist.size());
for(WebElement ele:googlelist) {
String text=ele.getText();
System.out.println(text);
if(text.equals("naveen automation labs java")) {
	ele.click();
	break;
	
}
}
	}

}
