package sept2020seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {
	static WebDriver driver;
	public static void main (String args[]) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		By googlelinks=By.xpath("//div[@id='SIvCob']/a");
		
		//get the text of each language link
		//click on each link
		//come back
		//click on next link
	
		//List <WebElement>links=driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		//.out.println("total no of links :" +links.size());
		
		//for(WebElement e:links) {
			//String text=e.getText();
			//System.out.println(text);
		//	e.click();
		//if(text.equals("मराठी")) {
			//e.click();
			//break;
	//	}			
		
		
			//stale element exception bcz dom got updated.but google doest support back method.
		
			//links=	driver.findElements(By.xpath("//div[@id='SIvCob']/a"));	//
	doclickfromlink(googlelinks, "ગુજરાતી");	
		
	}
	public static List<WebElement> getelements(By locator) {
		return driver.findElements(locator);
		
	}
	
	
	public static void doclickfromlink(By locator,String link_text) {
		
	List<WebElement> googlelist=	getelements(locator);
	System.out.println("total no of links :" +googlelist.size());
	for(int i=0;i<googlelist.size();i++) {
		String text=googlelist.get(i).getText();
		System.out.println(text);
		if(text.equals(link_text)) {
			googlelist.get(i).click();
			break;
		}
				
		}
	}
	}
	


