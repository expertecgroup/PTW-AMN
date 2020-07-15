import org.openqa.selenium.WebDriver;

public class Registration_Page  extends ActionPage{

	
	
	public static WebDriver myDriver;
	
	
	public static void RegoEntry()
	{
	  Clickelements(login);
	  Clickelements(reg_Signup_btn);
	  User_Input(reg_EmailID, "d@gmail.com");
	  User_Input(reg_UserName, "digitalarif");
	  User_Input(reg_pass, "plastic1");
	  User_Input(reg_conf_pass, "plastic1");
	  User_Input(reg_frst_nm, "Arif");
	  User_Input(reg_lst_nm, "Ahmed");
	  User_Input(reg_addrss, "Queens Village");
	 // User_Input(reg_chkbox, Input);
	  Clickelements(reg_chkbox);
	  Clickelements(reg_crt_btn);
	  
	  
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	OpenBrowser("https://www.demo.iscripts.com/multicart/demo/index.php");
    
	//myDriver.manage().window().maximize();
	WaitTime(5);
    RegoEntry();
	}

}
