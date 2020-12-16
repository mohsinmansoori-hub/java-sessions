package sept2020seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\jar files\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.orangehrm.com/");
	}

}
