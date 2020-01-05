package com.qspiders.google.scripts;

import org.testng.annotations.Test;

import com.qspiders.google.generic.BaseTest;
import com.qspiders.google.pages.GoogleSearchPage;

public class GoogleSearchText extends BaseTest
{
	
	
	@Test
	public void googleSearch() throws Throwable 
	{
			
		GoogleSearchPage gsp = new GoogleSearchPage(driver);
		
		gsp.searchFor("Selenium");
		
	}
	

}
