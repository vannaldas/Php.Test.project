package com.php.Testcasese;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
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
    public void validlogin()
    {
     
    }
}
