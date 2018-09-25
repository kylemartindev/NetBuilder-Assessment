package com.qa.TestingChallenge6;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoundaryKeys {
	
	@FindBy (xpath="/html/body/div[2]/div/div/div/div/div[2]/form/div[1]/div[1]/input")
	private WebElement inputbox;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/form/div/div[2]/input")
	private WebElement submitbox;
	
	public void lessonehour() {
		inputbox.clear();
		inputbox.sendKeys("25/09/2017 13:44");
		submitbox.click();
		
	}
	
	public void zerodays() {
		inputbox.clear();
		inputbox.sendKeys("00/09/2017 05:44");
		submitbox.click();
		
	}
	
	public void zeromonths() {
		inputbox.clear();
		inputbox.sendKeys("24/00/2017 12:35");
		submitbox.click();
	}
	
	public void maxmonths () {
		inputbox.clear();
		inputbox.sendKeys("14/13/2017 08:15");
		submitbox.click();
	}
	
	public void firstdatebefore2017 () {
		inputbox.clear();
		inputbox.sendKeys("31/12/2016 23:59");
		submitbox.click();
		
	}
	
	public void lastdate2017() {
		inputbox.clear();
		inputbox.sendKeys("01/01/2018 00:00");
		submitbox.click();
		
	}
	
	public void maxminutes() {
		inputbox.clear();
		inputbox.sendKeys("15/09/2017 14:60");
		submitbox.click();
	}
	
	public void maxhour () {
		inputbox.clear();
		inputbox.sendKeys("18/03/2017 24:25");
		submitbox.click();
	}
	
	public void minhour () {
		inputbox.clear();
		inputbox.sendKeys("11/04/2017 -1:12");
		submitbox.click();
		
	}
	
	public void minmin() {
		inputbox.clear();
		inputbox.sendKeys("23/05/2017 02:-1");
		submitbox.click();
	}

	public void marchdayhighestlightsavinghour() {
		inputbox.clear();
		inputbox.sendKeys("26/03/2017 02:00");
		submitbox.click();
		
	}
	
	public void marchdaylowestlightsavinghour() {
		inputbox.clear();
		inputbox.sendKeys("26/03/2017 02:59");
		submitbox.click();
		
	}
	public void hourthatexiststwice() {
		inputbox.clear();
		inputbox.sendKeys("26/03/2017 01:00");
		submitbox.click();
		
	}
	
	public void thirtydaysin31month() {
		inputbox.clear();
		inputbox.sendKeys("31/04/2017 05:45");
		submitbox.click();
	}
	
	public void maxdaysinmonth() {
		inputbox.clear();
		inputbox.sendKeys("32/01/2017 05:45");
		submitbox.click();
		
	}
	
	public void leapdayfeb() {
		inputbox.clear();
		inputbox.sendKeys("29/02/2017 03:45");
		submitbox.click();
		
	}

}


