package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.utility.BaseClass;
import com.utility.Library;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_verifyloginPage extends BaseClass{
	
	@Test
	public void verifyFBloginTest_Invaliddata() {
		
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_sendkeys(login.gettxt_Emailid(), excel.getStringData("Sheet1", 0, 0),"Email");
		Library.custom_sendkeys(login.gettxt_password(), excel.getStringData("Sheet1", 0, 1),"Password");
		//login.gettxt_password().sendKeys("123456789");
		Library.custom_click(login.getbtn_loginbutton(),"login_button");
		//login.getbtn_loginbutton().click();
		Assert.assertTrue(false);
		
		//email
		//passwor
		//loginbutton click
	}

}
