package com.qa.TestingChallenge2;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPage {
	
	WebDriver driver;

	@Before
	public void setUp() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Max\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	}

	@Test 
	public void addnonInteger(){
	driver.get("http://testingchallenges.thetestingmap.org/challenge2.php");
	WebElement input = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/div/div/input"));

	    ((JavascriptExecutor) driver).executeScript(
	                "arguments[0].setAttribute('type','string')",input);
	
	WebpageTestClass webpage = PageFactory.initElements(driver, WebpageTestClass.class);
	webpage.TestPage();

	
	assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/div/div/input")).getAttribute("value").contains("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z"));
	
	}
	
	

	@After
	public void teardown () {
		driver.quit();
		
	}



}
