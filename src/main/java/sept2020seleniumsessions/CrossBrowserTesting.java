package sept2020seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
      static WebDriver driver; 
	public static void main(String[] args) {
		//WebDriver driver=null;
		//local varibale should be initialized with default value.
		String browser="chrome";
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
WebDriverManager.firefoxdriver().setup();
			
			
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("enter correct browser");
		}
		driver.get("http://google.com");
		String title=driver.getTitle();
System.out.println(title);
driver.close();

	}

}
