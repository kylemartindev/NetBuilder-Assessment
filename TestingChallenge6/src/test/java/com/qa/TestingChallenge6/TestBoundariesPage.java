package com.qa.TestingChallenge6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBoundariesPage {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Max\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	
	@Test
	public void Boundairies()  {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.lessonehour();
		
	}
	
	@Test 
	public void Boundaries2() {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.zerodays();
	
		}
	
	@Test
	public void Boundaries3 () {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.zeromonths();
		
	}
	
	@Test 
	public void Boundaries4()  {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.maxmonths();
		
	}
	
	@Test
	public void Boundaries5 ()  {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.firstdatebefore2017();
	
	}
	
	@Test
	public void Boundaires6 () {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.lastdate2017();
		
	}
	@Test
	public void Boundaires7 ()  {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.maxminutes();
		
	}
	
	@Test
	public void Boundaires8 ()  {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.maxhour();
	
	}
	
	@Test
	public void Boundaires9 ()  {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.minhour();;
	
	}
	
	@Test 
	public void Boundaires10 () {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.minmin();

	}
	
	@Test
	public void Boundaires11 ()  {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.marchdayhighestlightsavinghour();

	}
	
	@Test
	public void Boundaires12()  {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.marchdaylowestlightsavinghour();

	}
	
	@Test
	public void Boundaires13 () {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.hourthatexiststwice();
	
	}
	
	@Test
	public void Boundaires14 () {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.thirtydaysin31month();
		
	}
	
	@Test
	public void Boundaires15 () {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.maxdaysinmonth();
	
	}
	
	@Test
	public void Boundaires16() {
		driver.get("http://testingchallenges.thetestingmap.org/challenge6.php");
		BoundaryKeys boundarytesting = PageFactory.initElements(driver, BoundaryKeys.class);
		boundarytesting.leapdayfeb();
		
	}
	
	@After
	public void teardown() {
		driver.quit();
		
	}

}

