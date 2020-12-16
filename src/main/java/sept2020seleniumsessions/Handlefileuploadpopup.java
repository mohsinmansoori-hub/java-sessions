package sept2020seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlefileuploadpopup {
	public static void main (String args[]) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	WebElement file=	driver.findElement(By.name("upfile"));
	file.sendKeys("C:\\Users\\Mohasin\\Pictures\\Screenshots\\Screenshot (1).png");
		

}
}