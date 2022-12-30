package com.news18.metatagcontent;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author Danishr
 * This class contains the script for verification of meta tag content inside the view page source in desktop mode
 */
public class DesktopTamilMetaTagContentValidation extends DesktopCommonConfig{
	/**
	 * @author Danishr
	 * This method is used to navigate to News18 Home Page for Tamil Language URL which is fetching from Property File
	 * Url- https://tamil.news18.com/
	 */
//	@BeforeMethod
	public void  navigateToTamilHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("tamilUrl"));
	}

	/**
	 * @author Danishr
	 * This method is used to click on First Article of News18 tamil Home Page and
	 * Validate the meatatag content inside the view page source
	 */
	@Test
	public void verifyMetatagInHomeArticle() {
		pages.desktopTamilLandingPage. clickOnFirstArticleHomePage();
		pages.metaTagContentValidation.verifyHeaderAndMetatagcontent();
	}



}
