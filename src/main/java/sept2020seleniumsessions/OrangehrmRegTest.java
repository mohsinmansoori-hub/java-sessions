package sept2020seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangehrmRegTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.int_driver("chrome");
		br.launchurl("https://www.orangehrm.com/");
		String title=br.getpagetitle();
		System.out.println(title);
		
		
		By link_trial=By.linkText("FREE 30 Day Trial");
		By valid_url=By.id("Form_submitForm_subdomain");
		By name=By.id("Form_submitForm_FirstName");
		By last_name=By.id("Form_submitForm_LastName");
		By email=By.id("Form_submitForm_Email");
		By job_title=By.id("Form_submitForm_JobTitle");
		By employees=By.id("Form_submitForm_NoOfEmployees");
		By company_name=By.id("Form_submitForm_CompanyName");
		By industry=By.id("Form_submitForm_Industry");
		By contact_no=By.id("Form_submitForm_Contact");
		By country=By.id("Form_submitForm_Country");
		
		
		
		
		ElementUtil ul=new ElementUtil(driver);
		ul.getelement(link_trial).click();
		Thread.sleep(3000);
		ul.doSendKeys(valid_url, "mohsin@123");
		ul.doSendKeys(name, "mohsin");
		ul.doSendKeys(last_name, "mansoori");
		ul.doSendKeys(email, "mohsinmansoori@gmail.com");
		ul.doSendKeys(job_title, "test engineer");
		ul.doSendKeys(employees, "151-200");
		ul.doSendKeys(company_name , "TCS");
		ul.doSendKeys(industry, "Travel");
		ul.doSendKeys(contact_no, "888971852");
		ul.doSendKeys(country, "India");
		if(ul.doisdisplayed(name)) {
			System.out.println("element is present");
			
			
			
		}
		
		
		br.quitbrowser();
		
		
	}
	
	

}
