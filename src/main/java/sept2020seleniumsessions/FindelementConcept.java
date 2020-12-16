package sept2020seleniumsessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindelementConcept {
	
	public static void main  (String args[]) {
		//all links--->a
		//all images--->img
		//all text fields--->input
		//all buttons--->button
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//get total no of links
		//get text of each link
		//ignore blank text
		
		driver.get("https://www.amazon.in/");
		
				List <WebElement> ll=driver.findElements(By.tagName("a"));
				System.out.println("total no of links  :"  +ll.size());
				
				for(int i=0;i<ll.size();i++) {
					String text=ll.get(i).getText();
				
		
					if(! text.isEmpty()) {
						System.out.println(i+"---->" +text);
					}
				}
		}
	
	

}
