package sept2020seleniumsessions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoWebTable {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/8048/scorecard/1216495/sunrisers-hyderabad-vs-mumbai-indians-56th-match-indian-premier-league-2020-21");
		Thread.sleep(3000);
		//String text=driver.findElement(By.xpath("//a[text()='RG Sharma']//parent::td//following-sibling::td/span/span")).getText();
//System.out.println(text);
//List<WebElement> ele=driver.findElements(By.xpath("//a[text()='RG Sharma']//parent::td//following-sibling::td"));
//for(WebElement element:ele) {
	//String scorecard=element.getText();
	//if(!scorecard.isEmpty()) {
	//System.out.println(scorecard);
	//}
//}

	//}
		//System.out.println(playerscorecard("SA Yadav"));
	//playerscorecard("Ishan Kishan");
		System.out.println(bowlerscorecard("Sandeep Sharma"));
		System.out.println(playerscorecard("SA Yadav"));
	}
	public static List<String> playerscorecard(String playername) {
		List <String>scorecardlist=new ArrayList<String>();
		System.out.println("scorecard for :" +playername);
	List <WebElement>scorecard=	driver.findElements(By.xpath("//a[text()='"+playername+"']//parent::td//following-sibling::td"));
	for(WebElement ele:scorecard) {
		String text=ele.getText();
		if(!text.isEmpty()) {
			scorecardlist.add(text);
		}
		
		
				
	}
	return scorecardlist;
	}
	public static List<String> bowlerscorecard(String bowlername) {
		System.out.println("bolwing performanve of :" +bowlername);
		List <String>scorecardlist1=new ArrayList<String>();
		List <WebElement>scorecard1	=driver.findElements(By.xpath("//a[text()='"+bowlername+"']//parent::td//following-sibling::td"));	
		
		for(int i=0;i<scorecard1.size();i++) {
			String text= scorecard1.get(i).getText();
			if(!text.isEmpty()) {
				scorecardlist1.add(text);
			}
		}
		return scorecardlist1;
	}

}
