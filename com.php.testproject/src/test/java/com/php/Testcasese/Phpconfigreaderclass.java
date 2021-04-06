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
		public String gethomelink() {
			return prop.getProperty("clickhome");
			
		}
		public String getflightslink() {
			return prop.getProperty("flightslink");
			
		}
		public String getradio2link() {
			return prop.getProperty("radio2link");
			
		}
		public String getradio1link() {
			return prop.getProperty("radio1link");
			
		}
		public String getfromlink() {
			return prop.getProperty("From");
			
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
		public String getemail1() {
			return prop.getProperty("email1");
			
		}
		public String getpasswordname() {
			return prop.getProperty("password");
			
		}
		public String getloginpassword() {
			return prop.getProperty("loginpassword");
			
		}
		public String getconpasswordname() {
			return prop.getProperty("Cpassword");
			
		}
		public String getcpasswordelement() {
			return prop.getProperty("cpass");
			
		}
		public String getfromelement() {
			return prop.getProperty("fromelement");
			
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
		public String getemelement() {
			return prop.getProperty("Em1");
		}
		public String getpnameelement() {
			return prop.getProperty("pname");
			
		}
		public String getwpnameelement() {
			return prop.getProperty("wpname");
			
		}
		public String getpname1element() {
			return prop.getProperty("pname1");
			
		}
		public String getwpname2element() {
			return prop.getProperty("wphone");
			
		}
		public String getcpnameelement() {
			return prop.getProperty("Cpname");
		}
		public String getwcpnameelement() {
			return prop.getProperty("wcpname");
		}
		public String getbrowsername() {
			return prop.getProperty("browsername");
		}
		public String getloginlink() {
			return prop.getProperty("loginlink");
		}
		public String getmybookinglink() {
			return prop.getProperty("mybookings");
		}
		
		public String getsignuplink() {
			return prop.getProperty("signuplink");
		}
		public String getsignup() {
			return prop.getProperty("signup");
		}
		public String getlogout() {
			return prop.getProperty("logout");
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
		
		
		public String getphonenumber() {
			return prop.getProperty("phonenumber");
		}
		public String getmyaccount() {
			return prop.getProperty("myaccount");
		}
		
		
	}

