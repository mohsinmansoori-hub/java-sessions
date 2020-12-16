package sept2020seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuit {
	public static void main(String args[]) {
		//to see session id we need to debug code.
		//Session id:ChromeDriver: chrome on XP (d8c9277e5697098656a10729ed251540)
		//it is unique 
		//after quit,code session id will become null.
		//session id will not get close it will just become null.
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://google.com");
		String title=driver.getTitle();
System.out.println(title);

driver.quit();


System.out.println(driver.getTitle());
//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit().
driver=new ChromeDriver();
driver.get("http://google.com");
System.out.println(driver.getTitle());
	}


}
