package com.qspiders.google.scripts;

import org.testng.annotations.Test;

import com.qspiders.google.generic.BaseTest;
import com.qspiders.google.pages.GoogleSearchPage;

public class LinkedInProfilePic extends BaseTest
{
	@Test
	public void googleSearch() throws Throwable 
	{
		GoogleSearchPage gsp = new GoogleSearchPage(driver);
		gsp.searchFor("er-bhaskar-480778a9/");
		Thread.sleep(2000);
		
	}
	
	

}
