import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class LoginPage {
	// -----------------------Xpath-----------------------  //
	
	static String login = "//span[contains(text(),'Login')]";
	static String username = "//input[@id='username']" ;
	static String password = "//input[@id='password']" ;
	static String login_btn = "//button[@id='jqLogin']" ;
	static String profile_name_link = "//span[contains(text(),'James williams')]";
	static String Logout ="//ul[@class='dropdown-menu header_user_dropdown dropdown']//div[3]//a[1]" ;
	static String my_account_lnk = "/html[1]/body[1]/div[1]/div[1]/nav[1]/div[3]/div[1]/div[3]/div[1]/ul[1]/li[1]/div[1]/div[1]/a[1]" ;
	static String my_profile_link ="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]";
	
	
	public static WebDriver myDriver ;
	
	
	static void navigate() {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium_jar_files\\chromedriver_win32\\chrome_v83_driver\\chromedriver.exe") ;
		ChromeDriver myDriver = new ChromeDriver() ;
		myDriver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
	}

	/* static void login() {
		 
		myDriver.findElement(By.xpath(login)).click();
		myDriver.findElement(By.xpath(username)).sendKeys("user");
		myDriver.findElement(By.xpath(password)).sendKeys("pass");
		myDriver.findElement(By.xpath(login_btn)).click(); 
		myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}*/
	 
	 static void profile() {
		 
		myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		myDriver.findElement(By.xpath(profile_name_link)).click();
		myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		myDriver.findElement(By.linkText(my_account_lnk)).click();
		myDriver.findElement(By.xpath(my_profile_link)).click();
	 }
	 
	 static void logout() {
		 
		 myDriver.findElement(By.xpath(profile_name_link)).click();
		 myDriver.findElement(By.xpath(Logout)).click();
			
	 }


	public static void main(String[] args) {
	
		navigate();
	    
		//login();
		// Action Class - Login 
		
		myDriver.findElement(By.xpath(login)).click();
		myDriver.findElement(By.xpath(username)).sendKeys("user");
		myDriver.findElement(By.xpath(password)).sendKeys("pass");
		myDriver.findElement(By.xpath(login_btn)).click(); 
		
		// Profile Update
	    profile();
		
		// Wait Statement 
		myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		// Action Class - Logout
		logout();

	}
	

}
