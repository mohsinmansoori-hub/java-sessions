package sept2020seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {
	public static void main (String args[]) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		
		co.addArguments("--headless");
		WebDriver driver= new ChromeDriver(co);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
	}
	}


