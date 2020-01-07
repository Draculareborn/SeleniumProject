package com.qspiders.google.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

/***
 * 
 * @author Bhaskar Singh
 *
 */

public class LinkedInProfilePage {
	@FindBy(xpath="//img[@class='entity-image entity-image--profile entity-image--circle-8 top-card-layout__entity-image lazy-loaded']") private WebElement profilepic;
	
	
	public LinkedInProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void getprofilepic() throws IOException  
	{
		File src = profilepic.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/bhaskarppl.png");
		Files.copy(src, dest);
	}

}
