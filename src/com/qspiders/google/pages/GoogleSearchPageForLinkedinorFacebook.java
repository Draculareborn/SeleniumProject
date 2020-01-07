package com.qspiders.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Bhaskar Singh
 *
 */

/*	This is POM class for google search page*/
public class GoogleSearchPageForLinkedinorFacebook {
	
	@FindBy(name="q") private WebElement searchTextBox;
	
	/***
	 * Here we are initializing elements in POM class.
	 * @param driver
	 */
	public GoogleSearchPageForLinkedinorFacebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/***
	 * This will return the address of search textbox.
	 * @return
	 */
	public WebElement getSearchTextBox()
	{
		return searchTextBox;
		
	}
	
	/***
	 * We are sending an input to search textbox.
	 * @param text
	 */
	public void setSearchTextBox(String text) 
	{
		searchTextBox.sendKeys(text,Keys.ENTER);
		
	}

}
