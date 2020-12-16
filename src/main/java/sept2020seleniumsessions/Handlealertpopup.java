package sept2020seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlealertpopup {
	public static void main (String args[]) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(4000);
		
	Alert alert=	driver.switchTo().alert();
	String text=alert.getText();
	System.out.println(text);
	if(text.equals("Please enter a valid user name")) {
		System.out.println("correct text");
	}
	else {
		System.out.println("invalid text");
	}
	alert.accept();//click on ok
	//alert.dismiss();//click on cancel 
	
	driver.switchTo().defaultContent();//we come back to main page 
	}

}
