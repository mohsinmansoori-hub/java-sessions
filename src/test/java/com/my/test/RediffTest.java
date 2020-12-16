package com.my.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffTest extends BaseTest {
	public static String Redifftitle="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
	


	@Test(priority=1)
	public void Googletitletest() throws InterruptedException {
		String title=driver.getTitle();
		System.out.println("title is----> "+title);
	Assert.assertEquals(title, RediffTest.Redifftitle);	
	Thread.sleep(3000);
	}

	@Test(priority=2)
	public void getRediffUrltest() {
		String url=driver.getCurrentUrl();
		System.out.println("url is --->"+url);
		Assert.assertTrue(url.contains("rediff"));
	}
	

	

}
