package com.php.Testcasese;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PhpApploginTest 
{
	
	public static PhpServices phpserviices;
	
	
	@BeforeSuite
	public void setupsuite() {
		phpserviices=new  PhpServices();
		
	}
  @BeforeTest
  public void browserlaunch() {
	  phpserviices.launchbrowser();
  }
  
      @Test
      @Ignore
    public void validsignup() throws Exception
    {
    	  phpserviices.clickmyaccountlink(); phpserviices.clicksignuplink();
    	  phpserviices.FirstName();phpserviices.LastName(); phpserviices.phonenumber();
    	  phpserviices.validemail(); phpserviices.password(); phpserviices.confpassword();
    	  phpserviices.clicksignup();
      
    }
      
      @Test
      @Ignore
      public void invalidsignup1() throws Exception {
    	  phpserviices.clickmyaccountlink(); phpserviices.clicksignuplink();
    	  phpserviices.FirstNameempty();phpserviices.LastNameempty();
    	  phpserviices.clicksignup();
    	
      }
      @Test
      @Ignore
      public void invalidmail() throws Exception {
    	  phpserviices.clickmyaccountlink(); phpserviices.clicksignuplink();
    	  phpserviices.FirstName();phpserviices.LastName(); phpserviices.phonenumber();
    	  phpserviices.invalidEmail();phpserviices.password(); phpserviices.confpassword();
    	  phpserviices.clicksignup();phpserviices.erroremailmesage();
      }
      @Test
      @Ignore
      public void wrongphoneandpassword() throws Exception {
    	  phpserviices.clickmyaccountlink(); phpserviices.clicksignuplink();
    	  phpserviices.wphonenumber();phpserviices.wpassword();phpserviices.wconfpassword();
      }
      @Test
      @Ignore
      public void exceldata() throws Exception {
    	  phpserviices.clickmyaccountlink(); phpserviices.clicksignuplink();
    	  phpserviices.FirstNameexcel();phpserviices.LastNameexcel();
    	  phpserviices.phonenumberexcel();
    	  
    	   phpserviices.validemailexcel();
    	  phpserviices.passwordexcel();phpserviices.confpasswordexcel();
    	  
      }
      
      
      @Test
 
      public void validlogin() throws Exception {
    	  phpserviices.clickmyaccountlink(); phpserviices.clickloginlink();
    	  phpserviices.loginemail();  phpserviices.loginpassword();
    	  phpserviices.clickloginbutton();phpserviices.entercountry();phpserviices.clickhomebutton();
    
    	  phpserviices.clickflightslink();phpserviices.clickradio2button();
    	  phpserviices.clickfromlink2();
    	   //phpserviices.clickTolink();                 
    	  
    	  
    	  
      }
      
      @AfterTest
      @Ignore
      public void closebrowser() {
    	  phpserviices.browserclose();
      }
      
}
