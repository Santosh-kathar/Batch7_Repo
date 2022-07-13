package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.utility.Library;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	@Test
	public void brokenlink() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//link---tagname--->a
		
		List<WebElement> linkslist=driver.findElements(By.tagName("a"));
		System.out.println(linkslist.size());
		
		Library.verifybrokenlink(null);
		for(int i=0; i<linkslist.size();i++) {
			
			WebElement ele=linkslist.get(i);
			String url=ele.getAttribute("href");
			Library.verifybrokenlink(url);
		}
		
	}
}
