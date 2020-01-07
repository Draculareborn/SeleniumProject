package com.qspiders.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author Bhaskar Singh
 *
 */

/*This class is for handling when we have searched something in google search and search page is displayed*/

public class InGoogleSearchPage {
	
	@FindBy(xpath="//h3[.='Er. BHASKAR . - Jaipur, Rajasthan, India | Professional Profile ...']") private WebElement LinkedInLink;
	
	public InGoogleSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/***
	 * Get the linkedin link
	 * @return
	 */
	public WebElement getLinkedinLink()
	{
		return LinkedInLink;
		
	}
	
	/***
	 * Here we are clicking on the link
	 */
	public void setLinkedinLink() 
	{
		LinkedInLink.click();
	}

}
