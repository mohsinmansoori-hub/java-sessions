package sept2020seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragnDrop {

 static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
WebDriverManager.chromedriver().setup(); 
driver=new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
System.out.println("browser executed");
Thread.sleep(5000);
driver.switchTo().frame(0);
System.out.println("enter frame");
WebElement drag=driver.findElement(By.id("draggable"));
System.out.println("first elemetn");
WebElement target1=driver.findElement(By.id("droppable"));
Actions a = new Actions (driver);
a.clickAndHold(drag).moveToElement(target1).release().build().perform();
driver.switchTo().defaultContent();
//a.dragAndDrop(drag, target1);another method for dragndrop.perform
	}

}
