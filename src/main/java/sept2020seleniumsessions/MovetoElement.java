package sept2020seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElement {
	 static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		//Actions a= new Actions(driver);
		//WebElement login=driver.findElement(By.id("ctl00_HyperLinkLogin"));
			//	a.moveToElement(login).build().perform();
				//Thread.sleep(3000);
				//WebElement member=	 driver.findElement(By.linkText("SpiceClub Members"));
				//a.moveToElement(member).build().perform();
				//Thread.sleep(4000);
			//	driver.findElement(By.linkText("Member Login")).click();
				
				
				
		By mainmenu=By.id("ctl00_HyperLinkLogin");
		By submenu =By.linkText("SpiceClub Members");
By submenu1=By.linkText("Member Login");


movetoelement(mainmenu);
Thread.sleep(5000);
movetoelement(submenu);
Thread.sleep(5000);
movetoelementclick(submenu1);
	}
	public static WebElement getelement(By locator) {
		return driver.findElement(locator);
		
	}
	public static void movetoelement(By locator) {

		
		Actions a=new Actions(driver);
	
		a.moveToElement(getelement(locator)).build().perform();

			
	}
	public static void movetoelementclick(By locator) {
		getelement(locator).click();
		
		
		
		
	}

}
