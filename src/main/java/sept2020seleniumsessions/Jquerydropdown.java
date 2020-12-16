package sept2020seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquerydropdown {
	static WebDriver driver ;
	public static void main (String args[]) throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(4000);
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);
	//List <WebElement>=	driver.findElements(By.className("//span[@class='comboTreeItemTitle']"));
	By chioce_span=	By.xpath("//span[@class='comboTreeItemTitle']");
	//jqueryselectdropdown(chioce_span, "choice 2");//single selection
	//jqueryselectdropdown(chioce_span, "choice 1");single selection
	//jqueryselectdropdown(chioce_span, "choice 1","choice 2", "choice 6 2 3");//multiple selection
	jqueryselectdropdown(chioce_span, "all");	
	}
	
	      public static void jqueryselectdropdown(By locator,String... value) {//three dots means we can give multiple value as it has become array.jquery
        	  List<WebElement> selectchoice=driver.findElements(locator);
        		System.out.println(selectchoice.size());
        		if(! value[0].equalsIgnoreCase("all")) {
        				
        		for(int i=0;i<selectchoice.size();i++) {
        			String text=selectchoice.get(i).getText();
        			System.out.println(text);
        			//if(text.equals(value)) {this is for singele value
        				//ele.click();
        				//break;
        			//}
        			
        			
        			for(int j=0;j<value.length;j++) {
        				if(text.equals(value[j])) {
        					selectchoice.get(i).click();
        					break;
        				}
        			}
        		
        		}
        		}
        		
        			
        		
        		else {
        			try {
        			for(WebElement e:selectchoice) {
        				e.click();
        				
        			}
        			}catch (Exception e) {
        				
        			}
        		}
        		}
        		
	        
	        
		
	}



