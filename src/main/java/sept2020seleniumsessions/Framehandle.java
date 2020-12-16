package sept2020seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framehandle {
	//frame method is a overloaded method in selenium

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		//driver.switchTo().frame(driver.findElement(By.name("main")));
		//driver.switchTo().frame(2);//indexing is not preffered,id and name is preffered
		driver.switchTo().frame("main");
		String header=driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(header);
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();

	}

}
