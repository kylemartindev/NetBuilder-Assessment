package com.qa.TestingChallenge2;

import javax.swing.text.Document;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebpageTestClass {
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/div/div/div/div/input")
	private WebElement inputletter;
	
	@FindBy(xpath="/html/body/div[2]/div/div/form/input")
	private WebElement submit;
	
	public void TestPage() {
		
		
		inputletter.sendKeys("hello");
		submit.click();
	}
	

}
