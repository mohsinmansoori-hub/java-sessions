package sept2020seleniumsessions;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil br=new BrowserUtil();
br.int_driver("chrome");

br.launchurl("https://www.orangehrm.com/");
Thread.sleep(3000);
String title=br.getpagetitle();
if(title.equals("HR Management System | HR Management Software | OrangeHRM")) {
	System.out.println("title is correct");
}else {
	System.out.println("incrroect title");
	
}

br.quitbrowser();

	}

}
