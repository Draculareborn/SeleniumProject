package com.qspiders.google.scripts;

import org.testng.annotations.Test;

import com.qspiders.google.generic.BaseTest;
import com.qspiders.google.pages.GoogleSearchPageForLinkedinorFacebook;
import com.qspiders.google.pages.InGoogleSearchPage;
import com.qspiders.google.pages.LinkedInProfilePage;

/***
 * 
 * @author Bhaskar Singh
 *
 */

public class GetProfilePic extends BaseTest {
	
	@Test
	public void getLinkedInProfilePic() throws Throwable
	{
		GoogleSearchPageForLinkedinorFacebook gsplf = new GoogleSearchPageForLinkedinorFacebook(driver);
		gsplf.setSearchTextBox("er-bhaskar-480778a9/");
		
		InGoogleSearchPage igsp = new InGoogleSearchPage(driver);
		igsp.setLinkedinLink();
		
		LinkedInProfilePage lpg = new LinkedInProfilePage(driver);
		lpg.getprofilepic();
		
		Thread.sleep(8000);
	}

}
