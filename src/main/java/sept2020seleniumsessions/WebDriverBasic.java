package sept2020seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
		
		//automation steps:
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://google.com");
		String title=driver.getTitle();
System.out.println(title);

//check point/verification point :
//automation and verification is called automation testing..  
if(title.equals("Google")) {
	System.out.println("correct title");
}
else {
	System.out.println("incorrect title");
	
}
//get the current url
System.out.println(driver.getCurrentUrl());
if(driver.getCurrentUrl().contains("google"));
System.out.println("url is correct");

//get page source
//System.out.println(driver.getPageSource());



//to close browser
driver.quit();

	}

}
