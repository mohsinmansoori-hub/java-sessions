package sept2020seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickconcept {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightrele=driver.findElement(By.xpath("//span[text()='right click me']"));
		
	Actions a=new Actions(driver);
a.contextClick(rightrele).perform();
List <WebElement>rightclicklist=driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-item context-menu-icon')]"));
System.out.println(rightclicklist.size());
for (WebElement ele:rightclicklist) {
	String text=ele.getText();
	System.out.println(text);
	if(text.equals("Edit")) {
		ele.click();
		break;
	}
	
}
	}

}
