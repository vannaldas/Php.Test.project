package com.php.Testcasese;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.php.Utillites.Phpcapturescreenshot;
import com.php.Utillites.Phpreadexcel;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class PhpServices extends PhpBrowserFactory   {
	public Phpconfigreaderclass reader=new Phpconfigreaderclass();
	//public static WebDriver driver;
public static Phpcapturescreenshot screen=new Phpcapturescreenshot();
	
	public static ExtentReports extent=new ExtentReports("./PhpTestReports/extentreport.html");
	public static ExtentTest test=extent.startTest("logintest");
	public static Excelconfigreader excel=new Excelconfigreader();
	



	public PhpServices launchbrowser() {
		
		
		PhpBrowserFactory.InvokeBrowser("chrome","https://www.phptravels.net/home");
		
		
		return this;
		
	}
	
	public PhpServices clickloginlink() throws Exception  {
		
		try {
			PhpCommonUtilites.clickweblink("xpath",reader.getloginlink(),driver);
		test.log(LogStatus.INFO, "Click login link");
		
			String screenshotpath=screen.capturescreen(driver, "Click login link");
			String screen1=test.addScreenCapture(screenshotpath);
			test.log(LogStatus.INFO, "sanpshotbelow:" +screen1);
			extent.flush();
			 Thread.sleep(2000);
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		return this;
		
	}
		
	public PhpServices clicksignuplink() throws Exception {
		PhpCommonUtilites.clickweblink("xpath",reader.getsignuplink(),driver);
		  Thread.sleep(2000);
		return this;
		
	}
	public PhpServices clickmyaccountlink() throws Exception {
		PhpCommonUtilites.clickweblink("xpath",reader.getmyaccount(),driver);
		 Thread.sleep(2000);
		return this;
		
	}
	
	/*public PhpServices clickDone() {
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
		
	}*/
	
	public PhpServices clickloginbutton() throws Exception {
		PhpCommonUtilites.clickweblink("xpath",reader.getloginbutton(),driver);
		 Thread.sleep(2000);
		return this;
		
	}
	public PhpServices clickhomebutton() throws Exception {
		PhpCommonUtilites.clickweblink("xpath",reader.gethomelink(),driver);
		 Thread.sleep(2000);
		return this;
		
	}
	public PhpServices clickflightslink() throws Exception {
		PhpCommonUtilites.clickweblink("xpath",reader.getflightslink(),driver);
		 Thread.sleep(2000);
		return this;
		
	}
	public PhpServices clickradio2button() throws Exception {
		PhpCommonUtilites.clickweblink("xpath",reader.getradio2link(),driver);
		 Thread.sleep(2000);
		return this;
		
	}
	public PhpServices clickradio1button() throws Exception {
		PhpCommonUtilites.clickweblink("xpath",reader.getradio1link(),driver);
		 Thread.sleep(2000);
		return this;
		
	}
	public PhpServices clickfromlink2() throws Exception {
		//PhpCommonUtilites.clickweblink("xpath",reader.getfromlink(),driver);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//WebElement text=driver.findElement(By.xpath("//input[@type='text'and@class='select2-input']"));
		
		
		//js.executeScript("document.getElementById('s2id_location_from').value='hyderabad'");
		 //Thread.sleep(6000);
		// js.executeScript("document.getElementsByClassName('select2-input').enter()");
		//driver.findElement(By.xpath("//input[@class='select2-focusser select2-offscreen'and@type='text'and@id='s2id_autogen7']"));
		//WebElement Text=driver.findElement(By.xpath("//input[@class='select2-focusser select2-offscreen'and@type='text'and@id='s2id_autogen7']"));
		//js.executeScript("arugments[0].value='hyderabad'",Text);
		Actions act=new Actions (driver);
		driver.findElement(By.xpath("//input[@type='text'and@id='s2id_autogen7']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'and@id='s2id_autogen7']")).sendKeys("hyderabad");
		Thread.sleep(6000);
		act.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("delhi")
		.pause(Duration.ofSeconds(4))
		.sendKeys(Keys.TAB)
		
		.build().perform();
		driver.findElement(By.xpath("//*[@id=\"FlightsDateStart\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[8]/div/div/div[2]/div[20]")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"FlightsDateEnd\"]")).click();
	Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[9]/div/div/div[2]/div[21]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[3]/div/div/div[1]/div/div[2]/div/span/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[3]/div/div/div[1]/div/div[2]/div/span/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[4]/button")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type='text'and@id='s2id_autogen7']")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//input[@class='select2-focusser select2-offscreen'and@type='text'and@id='s2id_autogen7']")).click();
		
		//driver.findElement(By.xpath("//input[@type='text'and@id='s2id_autogen7']")).sendKeys(Keys.ENTER);
		
		 //js.executeScript("document.getElementsByClassName('select2-input').click()");
		 
		
		
		
		return this;
		
	}
	public PhpServices clickTolink() throws Exception {
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementById('select2-drop').value='Delhi'");
		//WebElement text=driver.findElement(By.xpath("//input[@type='text'and@id='s2id_autogen8']"));
		driver.findElement(By.xpath("//input[@type='text'and@id='s2id_autogen8']")).sendKeys("delhi");
		 Thread.sleep(5000);
		 
		//js.executeScript("arguments[0].value='Delhi(DEL)'",text);
		
		return this;
		
	}
	public PhpServices clicksignup() throws Exception {
		PhpCommonUtilites.clickweblink("xpath",reader.getsignup(),driver);
		 Thread.sleep(2000);
		return this;
		
	}
	public PhpServices clicklogout() throws Exception {
		PhpCommonUtilites.clickweblink("xpath",reader.getlogout(),driver);
		 Thread.sleep(2000);
		return this;
		
	}

	@SuppressWarnings("deprecation")
	public PhpServices erroremailmesage() throws Exception {
		
		String actual_error=driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[2]/div")).getText();
		String Expected_error="The Email field must contain a valid email address.";
		Assert.assertEquals(actual_error, Expected_error);
		System.out.println("test passed");
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
	
	public PhpServices 	FirstName() throws Exception  {
		PhpCommonUtilites.logindatafield("xpath",reader.getfirstname(),reader.getfnameelement(),driver);
		Thread.sleep(2000);
		return this;
		
	}
	public PhpServices 	FirstNameexcel() throws Exception  {
		PhpCommonUtilites.logindatafield("xpath",reader.getfirstname(),excel.getData(0, 1, 0),driver);
		Thread.sleep(2000);
		return this;
		
	}
	public PhpServices 	FirstNameempty() throws Exception  {
		try {
		
		
		WebElement fname=driver.findElement(By.xpath("//input[@name='firstname']"));
		 System.out.println(fname.getAttribute("validationMessage"));
		
		}catch(Exception ex) {
			ex.getMessage();
			
			Thread.sleep(2000);
		}
		
		return this;
		
	}
	public PhpServices 	phonenumber() throws Exception  {
		
		PhpCommonUtilites.logindatafield("xpath",reader.getphonenumber(),reader.getpname1element(),driver);
		 Thread.sleep(2000);
		return this;
		
	}
public PhpServices 	phonenumberexcel() throws Exception  {
		
		PhpCommonUtilites.logindatafield("xpath",reader.getphonenumber(),excel.getData(0, 1, 2),driver);
		 //Thread.sleep(2000);
		
		
		return this;
	
	}
public PhpServices 	wphonenumber() throws Exception  {
		
		PhpCommonUtilites.logindatafield("xpath",reader.getphonenumber(),reader.getwpname2element(),driver);
		 Thread.sleep(2000);
		return this;
		
	}

public PhpServices clickfromlink() throws Exception  {

	PhpCommonUtilites.logindatafield("xpath",reader.getfromlink(),reader.getfromelement(),driver);
		
		
		
	 Thread.sleep(5000);
	 

	return this;
	
}
public PhpServices 	entercountry() throws Exception  {

	
		driver.findElement(By.xpath("//a[@class='btn btn-text-inherit btn-interactive'and@id='dropdownCurrency']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'INR')]")).click();
	
				
	 Thread.sleep(5000);
	 
	
	return this;
	
}
	
	
	
	public PhpServices LastName() throws Exception {
		PhpCommonUtilites.logindatafield("xpath",reader.getlastname(),reader.getlnameelement(),driver);
		 Thread.sleep(2000);
		return this;
		
	}
	public PhpServices LastNameexcel() throws Exception {
		PhpCommonUtilites.logindatafield("xpath",reader.getlastname(),excel.getData(0, 1, 1),driver);
		 Thread.sleep(2000);
		return this;
		
	}
	public PhpServices LastNameempty() throws Exception {
		try {
		
		WebElement lname=driver.findElement(By.xpath("//input[@name='lastname']"));
		 System.out.println(lname.getAttribute("validationMessage"));
		}catch(Exception ex) {
			ex.getMessage();
			
			Thread.sleep(2000);
		}
		
		
		return this;
		
	}
	public PhpServices invalidEmail() throws Exception {

		PhpCommonUtilites.logindatafield("xpath",reader.getEmail(),reader.getemelement(),driver);
		 Thread.sleep(2000);
		 
		
		
		return this;
		
	}
	public PhpServices validemail() {
		PhpCommonUtilites.logindatafield("xpath",reader.getEmail(),reader.getemaielement(),driver);
		
		return this;
		
	}
	public PhpServices loginemail() {
		PhpCommonUtilites.logindatafield("xpath",reader.getemail1(),reader.getemaielement(),driver);
		
		return this;
		
	}
	public PhpServices validemailexcel() {
		PhpCommonUtilites.logindatafield("xpath",reader.getEmail(),excel.getData(0, 1, 3),driver);
		
		return this;
		
	}
	public PhpServices validpassword() {
		PhpCommonUtilites.logindatafield("xpath",reader.getloginpass(),reader.getpnameelement(),driver);
		
		return this;
	}
		public PhpServices loginpassword() {
			PhpCommonUtilites.logindatafield("xpath",reader.getloginpassword(),reader.getpnameelement(),driver);
			
			return this;
		
	}
	public PhpServices password() {
		PhpCommonUtilites.logindatafield("xpath",reader.getpasswordname(),reader.getpnameelement(),driver);
		
		return this;
		
	}
	public PhpServices passwordexcel() {
		PhpCommonUtilites.logindatafield("xpath",reader.getpasswordname(),excel.getData(0, 1, 4),driver);
		
		return this;
		
	}
	public PhpServices wpassword() {
		PhpCommonUtilites.logindatafield("xpath",reader.getpasswordname(),reader.getwpnameelement(),driver);
		
		return this;
		
	}
	public PhpServices confpassword() {
		PhpCommonUtilites.logindatafield("xpath",reader.getconpasswordname(),reader.getcpnameelement(),driver);
		
		return this;
	
		
	}
	public PhpServices confpasswordexcel() {
		PhpCommonUtilites.logindatafield("xpath",reader.getconpasswordname(),excel.getData(0, 1, 5),driver);
		
		return this;
	
		
	}
	public PhpServices wconfpassword() {
		
		PhpCommonUtilites.logindatafield("xpath",reader.getconpasswordname(),reader.getwcpnameelement(),driver);
		//WebElement wcpassword=driver.findElement(By.xpath("//input[@name='confirmpassword']"));
		//wcpassword.sendKeys("munni1312");

		
		return this;
		
	}
	/*public PhpServices ClickDOB() {
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
		
	}*/
	public PhpServices loginbutton() {
		PhpCommonUtilites.loginbuttonfield("name",reader.getloginbutton(),driver);
		
		return this;
		
	}
	public PhpServices logindatafield3() {
		PhpCommonUtilites.logindatafield("name",reader.getusername(),reader.getusnameelement(),driver);
		return this;
		
	}
	
	
	
	public PhpServices browserclose() {
		closebrowser();
		
		return this;
		
	}
 
	

}
