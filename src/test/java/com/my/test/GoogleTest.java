package com.my.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	public static String googletitle="Google";
	



	@Test(priority=1)
	public void Googletitletest() {
		String title=driver.getTitle();
		System.out.println("title is----> "+title);
	Assert.assertEquals(title, GoogleTest.googletitle);	
	}

	@Test(priority=2)
	public void getGoogleUrltest() {
		String url=driver.getCurrentUrl();
		System.out.println("url is --->"+url);
		Assert.assertTrue(url.contains("google"));
	}
	

	






}
