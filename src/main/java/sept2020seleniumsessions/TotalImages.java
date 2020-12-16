package sept2020seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	static WebDriver driver;
	public static void main (String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//List <WebElement>img_list=driver.findElements(By.tagName("img"));
		//System.out.println("total no of links  :" +img_list.size());
		//for(WebElement ele:img_list) {
	//String src=ele.getAttribute("src");
	//System.out.println(src);//this is called data scraping.
		//}
	System.out.println("total no of images :"	+getelementcount("img"));
	System.out.println("total no of links :"	+getelementcount("a"));
	
	
	//List <String>attribute_list=getattributelist("img", "src");	
	//for(String ele:attribute_list) {
//	System.out.println(ele);
	//Thread.sleep(5000);
	
	
	List<String> href_list=getattributelist("a", "href");
	for(String href_ele:href_list) {
		System.out.println(href_ele);
		
	}
	
	
	}
	
	public static int getelementcount(String tagName) {
		return driver.findElements(By.tagName(tagName)).size();
		
		
		
	}
	
	public static  List <String> getattributelist(String tagname,String attribute) {
	 
		List <String>attributevalue=new ArrayList<String>();
		List <WebElement>img_list=driver.findElements(By.tagName(tagname));
		for(WebElement ele:img_list) {
			String text=ele.getAttribute(attribute);
			attributevalue.add(text);
	}
		return attributevalue;
		
		
	}

}
