package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;
/**
 * @author VipinKumarGawande
 This Test class contains the script to validate the  Sports Section are clickable 
 *and navigated to their pages
 */
public class AMPHindiSportsTest extends MobileCommonConfig{
	
	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to verify the sportsArticle present in the Home page of Mobile view
	 */
	@Test
	public void sportsArticleNavigation() {
		pages.ampHindiSanityLandingPage.verifySportsArticleNavigation(serverType);
	}
}
