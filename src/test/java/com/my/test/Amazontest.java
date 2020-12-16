package com.my.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
//until 30 testcases (sanity testing) we can user aftertest and before test as only one time browser will be launched.
//while for more test cases (regression ),before and after method. 
public class Amazontest extends BaseTest {
	public static String amazontitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";




@Test(priority=1)
public void Amazontitletest() {
	String title=driver.getTitle();
	System.out.println("title is----> "+title);
Assert.assertEquals(title, Amazontest.amazontitle);	
}

@Test(priority=2)
public void getAmazonUrltest() {
	String url=driver.getCurrentUrl();
	System.out.println("url is --->"+url);
	Assert.assertTrue(url.contains("amazon"));
}
@Test
public void mobilelinkpresenttest() {
Assert.assertTrue(driver.findElement(By.linkText("Mobiles")).isDisplayed())	; 

}






}
