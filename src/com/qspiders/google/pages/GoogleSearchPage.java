package com.qspiders.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
	
	@FindBy(name="q") private WebElement searchBox;
	
	public GoogleSearchPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchFor(String key) throws Throwable 
	{
		searchBox.sendKeys(key);
		Thread.sleep(1000);
		searchBox.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		searchBox.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	
	public WebElement searchFor() 
	{
		return searchBox;
	}
	
	
}
