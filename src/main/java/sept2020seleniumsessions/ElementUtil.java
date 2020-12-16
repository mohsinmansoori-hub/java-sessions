package sept2020seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	WebDriver driver;
public ElementUtil(WebDriver driver) {
this.driver=driver;	
}

public WebElement getelement( By locator) {
	return driver.findElement(locator);
	
}

public void doSendKeys(By locator,String value) {
getelement(locator).sendKeys(value);	
}
public void doClick(By locator) {
	getelement(locator).click();
	
}
public String dogettext(By locator) {
	return getelement(locator).getText();
	
}
public boolean doisdisplayed(By locator) {
	return getelement(locator).isDisplayed();
}


public int getelementcount(String tagname) {
	return  driver.findElements(By.tagName(tagname)).size();
	
	
}

public List <String> getattributelist(String tagname,String attribute) {
	List <String> attri_value =new ArrayList<String>();
	List <WebElement>images=driver.findElements(By.tagName(tagname));
	for(WebElement ele:images) {
		String text=ele.getAttribute(attribute);
		attri_value.add(text);
	}
	return attri_value;
	
}

}