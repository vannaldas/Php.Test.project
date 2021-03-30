package com.php.Testcasese;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Phpconfigreaderclass {
	public static Properties prop;
	
	public Phpconfigreaderclass() {
		
	
		try {
			File src=new File("./Php.Myfiles/PHPLogin.properties");
			//FileReader fis1 = new FileReader(src);
			
			FileInputStream fis=new FileInputStream(src);
			
			  prop =new Properties();
			//prop.load(fis1);
			prop.load(fis);
	
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}
		
	}
		public String getloginbutton() {
			return prop.getProperty("login");
			
		}
		public String getfirstname() {
			return prop.getProperty("fname");
			
		}
		public String getlastname() {
			return prop.getProperty("lname");
			
		}
		public String getusername() {
			return prop.getProperty("user");
			
			
		}
		public String getEmail() {
			return prop.getProperty("Email");
			
		}
		public String getpasswordname() {
			return prop.getProperty("password");
			
		}
		public String getconpasswordname() {
			return prop.getProperty("Cpassword");
			
		}
		public String getcpasswordelement() {
			return prop.getProperty("cpass");
			
		}
		public String getbrowserurl() {
			return prop.getProperty("browserurl");
			
		}
		public String getchromepath() {
			return prop.getProperty("CromeDriver");
			
			
		}
		public String getchromesetup() {
			return prop.getProperty("Chromesetup");
			
		}
		public String getfnameelement() {
			return prop.getProperty("firstname");
			
		}
		public String getlnameelement() {
			return prop.getProperty("lastname");
		}
		public String getusnameelement() {
			return prop.getProperty("Uname");
		}
		public String getusname1element() {
			return prop.getProperty("Uname1");
		}
		public String getemaielement() {
			return prop.getProperty("Em");
		}
		public String getpnameelement() {
			return prop.getProperty("pname");
			
		}
		public String getpname1element() {
			return prop.getProperty("pname1");
			
		}
		public String getcpnameelement() {
			return prop.getProperty("Cpname");
		}
		public String getbrowsername() {
			return prop.getProperty("browsername");
		}
		public String getloginlink() {
			return prop.getProperty("loginlink");
		}
		public String logoutelement() {
			return prop.getProperty("logout");
		}
		public String getsignuplink() {
			return prop.getProperty("signUp");
		}
		public String getgendar() {
			return prop.getProperty("gendar");
		}
		public String getDOB() {
			return prop.getProperty("DOB");
		}
		public String getmonth() {
			return prop.getProperty("MONTH");
		}
		public String getmonthvalue() {
			return prop.getProperty("MVALUE");
		}
		public String getyear() {
			return prop.getProperty("YEAR");
		}
		public String getyearvalue() {
			return prop.getProperty("YVALUE");
		}
		public String getclickdone() {
			return prop.getProperty("CLICKDONE");
		}
		public String getDobElemen() {
			return prop.getProperty("DOBVALUE");
		}
		public String getregister() {
			return prop.getProperty("Register");
		}
		public String getsignupsucsess() {
			return prop.getProperty("signupsucsess");
		}
		public String getemail() {
			return prop.getProperty("Emailelement");
		}
		public String getloginpass() {
			return prop.getProperty("loginpass");
		}
		public String getlbbutton() {
			return prop.getProperty("lbbutton");
		}
		public String getprolink() {
			return prop.getProperty("prolink");
		}
		public String getprofile() {
			return prop.getProperty("clikprofile");
		}
		public String getpropicture() {
			return prop.getProperty("propicture");
		}
		public String getsavebutton() {
			return prop.getProperty("savebutton");
		}
		public String gethomelink() {
			return prop.getProperty("clickhome");
		}
		public String getdeliteimage() {
			return prop.getProperty("delitingimage");
		}
		public String getchoosebutton() {
			return prop.getProperty("choosefile");
		}
		public String getsubcription() {
			return prop.getProperty("mysubscriptio");
		}
		public String getpersnoldairys() {
			return prop.getProperty("persnoldairys");
		}
		public String getaddpage() {
			return prop.getProperty("addpage");
		}
		
		public String getaddpagedate() {
			return prop.getProperty("adddate");
		}
		public String getaddpagedateelement() {
			return prop.getProperty("adddateelement");
		}
		public String getaddpagedatedone() {
			return prop.getProperty("adddatedone");
		}
		public String getaddthougtlink() {
			return prop.getProperty("linkaddurthougts");
		}
		public String getchoosfileelement() {
			return prop.getProperty("choosfileelement");
		}
		public String getthougtscript() {
			return prop.getProperty("thougtscript");
		}
		public String getthougtelement() {
			return prop.getProperty("thougtselement");
		}
	}

