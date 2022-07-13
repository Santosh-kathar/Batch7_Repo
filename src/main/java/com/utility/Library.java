package com.utility;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	public static void custom_sendkeys(WebElement element,String value,String fieldname) {
		try {
			if(element.isEnabled()==true) {
				element.sendKeys(value);
				test.log(Status.PASS, fieldname+"value Succesfully Send ==>"+value);
				
			}
			
		}catch(Exception e) {
			test.log(Status.FAIL, "unable to send ==>"+e);
		}
	}
	public static void custom_click(WebElement element,String fieldname) {
		try {
			if(element.isDisplayed()&&element.isEnabled()) {
				element.click();
				test.log(Status.PASS, "click succesfully");
			}
			
		}catch(Exception e) {
			test.log(Status.FAIL, "Unable to click"+e);
			
		}
	}
	public static void verifybrokenlink(String url1) throws Exception {
		URL url=new URL(url1);
		HttpURLConnection httpurl=(HttpURLConnection) url.openConnection();
		httpurl.setConnectTimeout(4000);
		httpurl.connect();
		
		if(httpurl.getResponseCode()==200){
			System.out.println("OK");
		}else {
			System.out.println("broken");
		}
		
		
	}
}