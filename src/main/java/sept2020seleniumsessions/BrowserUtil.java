package sept2020seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
WebDriver driver;
public WebDriver int_driver(String browser ) {
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	else if(browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver(); 
	}
	else {
		System.out.println( browser+ "wrong bowser,enter correct browser" );
	}
	return driver;
	
}

public void launchurl(String url) {
	System.out.println("url =" +url);
	driver.get(url);
}

public String getpagetitle() {
	return driver.getTitle();
}


public void quitbrowser() {
	driver.quit();
}
}
