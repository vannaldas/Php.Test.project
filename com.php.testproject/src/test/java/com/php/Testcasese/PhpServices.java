package com.php.Testcasese;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.php.Utillites.Phpcapturescreenshot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class PhpServices extends PhpBrowserFactory   {
	public Phpconfigreaderclass reader=new Phpconfigreaderclass();
	//public static WebDriver driver;
public static Phpcapturescreenshot screen=new Phpcapturescreenshot();
	
	public static ExtentReports extent=new ExtentReports("./PhpTestReports/extentreport.html");
	public static ExtentTest test=extent.startTest("logintest");



	public PhpServices launchbrowser() {
		
		
		PhpBrowserFactory.InvokeBrowser("chrome","https://www.phptravels.net/home");
		
		
		return this;
		
	}
	
	public PhpServices clickloginlink()  {
		
		try {
			PhpCommonUtilites.clickweblink("xpath",reader.getloginlink(),driver);
		test.log(LogStatus.INFO, "Click login link");
		
			String screenshotpath=screen.capturescreen(driver, "Click login link");
			String screen1=test.addScreenCapture(screenshotpath);
			test.log(LogStatus.INFO, "sanpshotbelow:" +screen1);
			extent.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		return this;
		
	}
		
	public PhpServices clicksignuplink() {
		PhpCommonUtilites.clickweblink("xpath",reader.getsignuplink(),driver);
		return this;
		
	}
	public PhpServices clickgendar() {
		PhpCommonUtilites.clickweblink("xpath",reader.getgendar(),driver);
		return this;
		
	}
	public PhpServices clickthougtlink() {
		PhpCommonUtilites.clickweblink("xpath",reader.getaddthougtlink(),driver);
		return this;
		
	}
	public PhpServices clickDone() {
		try {
			PhpCommonUtilites.clickweblink("xpath",reader.getclickdone(),driver);
		test.log(LogStatus.INFO, "Click done button");
		
		String screenshotpath=screen.capturescreen(driver, "Click done");
		String screen1=test.addScreenCapture(screenshotpath);
		test.log(LogStatus.INFO, "sanpshotbelow:" +screen1);
		extent.flush();
	} catch (Exception ex) {
		
		ex.getMessage();
		
	}
		System.out.println("wrong dob");
		return this;
		
	}
	public PhpServices clickDob() {
		PhpCommonUtilites.clickweblink("xpath",reader.getDOB(),driver);
		return this;
		
	}
	public PhpServices clicklbbutton() {
		PhpCommonUtilites.clickweblink("xpath",reader.getlbbutton(),driver);
		return this;
		
	}
	public PhpServices clickprolink() {
		PhpCommonUtilites.clickweblink("xpath",reader.getprolink(),driver);
		return this;
		
	}
	public PhpServices clickprofile() {
		PhpCommonUtilites.clickweblink("xpath",reader.getprofile(),driver);
		return this;
		
	}
	public PhpServices clickpropicture() {
		PhpCommonUtilites.clickweblink("xpath",reader.getpropicture(),driver);
		return this;
		
	}
	public PhpServices clicksavebutton() {
		PhpCommonUtilites.clickweblink("xpath",reader.getsavebutton(),driver);
		return this;
		
	}
	public PhpServices clickhomelink() {
		PhpCommonUtilites.clickweblink("xpath",reader.gethomelink(),driver);
		return this;
		
	}
	public PhpServices clickdeliteimage() {
		PhpCommonUtilites.clickweblink("xpath",reader.getdeliteimage(),driver);
		return this;
		
	}
	
	public PhpServices clickmysubcription() {
		PhpCommonUtilites.clickweblink("xpath",reader.getsubcription(),driver);
		return this;
		
	}
	public PhpServices clickadddatedone() {
		PhpCommonUtilites.clickweblink("xpath",reader.getaddpagedatedone(),driver);
		return this;
		
	}
	public PhpServices clickpersnoldairys() {
		PhpCommonUtilites.clickweblink("xpath",reader.getpersnoldairys(),driver);
		return this;
		
	}
	public PhpServices clickaddpage() {
		PhpCommonUtilites.clickweblink("xpath",reader.getaddpage(),driver);
		return this;
		
	}
	
	public PhpServices clickRejister() {
	
		PhpCommonUtilites.clickweblink("xpath",reader.getregister(),driver);
		
	
		return this;
	}
	public PhpServices getsignupsucsess() {
		try {
			PhpCommonUtilites.clickweblink("xpath",reader.getsignupsucsess(),driver);
test.log(LogStatus.INFO, "signup sucsess message");
		
		String screenshotpath=screen.capturescreen(driver, "signup sucsess");
		String screen1=test.addScreenCapture(screenshotpath);
		test.log(LogStatus.INFO, "sanpshotbelow:" +screen1);
		extent.flush();
		}catch(Exception ex) {
			ex.getMessage();
			
			
		}
		System.out.println("signup sucsess");
	
		return this;
	}
	
	public PhpServices 	FirstName()  {
		PhpCommonUtilites.logindatafield("xpath",reader.getfirstname(),reader.getfnameelement(),driver);
	
		return this;
		
	}
	public PhpServices thougtscriptjava() {
		try {
			PhpCommonUtilites.clickweblink("xpath",reader.getthougtscript(),driver);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement text=driver.findElement(By.xpath("//*[@id=\"htmlModal\"]/div/div/div[2]/ng-include/div[1]/div[2]/trix-editor"));
	
		js.executeScript("arguments[0].value='vamshi'",text);
		}catch(Exception ex) {
			ex.getMessage();
		}
		return this;
	}
	public PhpServices 	thougtscript()  {
		PhpCommonUtilites.logindatafield("xpath",reader.getthougtscript(),reader.getthougtelement(),driver);
	
		return this;
		//*[@id="htmlModal"]/div/div/div[2]/ng-include/div[1]/div[2]/trix-editor
	}
	public PhpServices 	choosfilelink()  {
		try {
			PhpCommonUtilites.logindatafield("xpath",reader.getchoosebutton(),reader.getchoosfileelement(),driver);
		}catch(Exception ex) {
			ex.getMessage();
			
			System.out.println("file loded suscessfulli");
		}
		
		
		return this;
		
	}
	public PhpServices addpagedatejava() {
		try {
			PhpCommonUtilites.clickweblink("xpath",reader.getaddpagedate(),driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('templatedate-picker').value='6/21/2020'");
		}catch(Exception ex) {
			ex.getMessage();
		
		}
		System.out.println("date loded suscessfulli");
		return this;
		
		
	}
	public PhpServices 	addpagedate()  {
	
		PhpCommonUtilites.logindatafield("xpath",reader.getaddpagedate(),reader.getaddpagedateelement(),driver);
	
		return this;
		
	}
	public PhpServices 	clickmonth()  {
		PhpCommonUtilites.logindatafield("xpath",reader.getmonth(),reader.getmonthvalue(),driver);
	
		return this;
		
	}
	
	public PhpServices 	clickyear()  {
		PhpCommonUtilites.logindatafield("xpath",reader.getyear(),reader.getyearvalue(),driver);
	
		return this;
		
	}
	
	public PhpServices LastName() {
		PhpCommonUtilites.logindatafield("xpath",reader.getlastname(),reader.getlnameelement(),driver);
		
		return this;
		
	}
	public PhpServices Email() {
		PhpCommonUtilites.logindatafield("xpath",reader.getEmail(),reader.getemaielement(),driver);
		
		return this;
		
	}
	public PhpServices validemail() {
		PhpCommonUtilites.logindatafield("xpath",reader.getusername(),reader.getemail(),driver);
		
		return this;
		
	}
	public PhpServices validpassword() {
		PhpCommonUtilites.logindatafield("xpath",reader.getloginpass(),reader.getpnameelement(),driver);
		
		return this;
		
	}
	public PhpServices password() {
		PhpCommonUtilites.logindatafield("xpath",reader.getpasswordname(),reader.getpnameelement(),driver);
		
		return this;
		
	}
	public PhpServices confpassword() {
		PhpCommonUtilites.logindatafield("xpath",reader.getconpasswordname(),reader.getcpnameelement(),driver);
		
		return this;
		
	}
	public PhpServices ClickDOB() {
		try {
			PhpCommonUtilites.logindatafield("id",reader.getDOB(),reader.getDobElemen(),driver);
		test.log(LogStatus.INFO, "Click dob");
		
		String screenshotpath=screen.capturescreen(driver, "Clicking dob");
		String screen1=test.addScreenCapture(screenshotpath);
		test.log(LogStatus.INFO, "sanpshotbelow:" +screen1);
		extent.flush();
	} catch (IOException e) {
		
		e.printStackTrace();
		
	}
		return this;
		
	}
	public PhpServices loginbutton() {
		PhpCommonUtilites.loginbuttonfield("name",reader.getloginbutton(),driver);
		
		return this;
		
	}
	public PhpServices logindatafield3() {
		PhpCommonUtilites.logindatafield("name",reader.getusername(),reader.getusnameelement(),driver);
		return this;
		
	}
	public PhpServices logout() {
		PhpCommonUtilites.loginbuttonfield("xpath",reader.logoutelement(),driver);
		return this;
		
	}
	
	
	public PhpServices browserclose() {
		closebrowser();
		
		return this;
		
	}
 
	

}
