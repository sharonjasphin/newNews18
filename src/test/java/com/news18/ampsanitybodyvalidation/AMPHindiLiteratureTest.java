package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;
/**
 * @author VipinKumarGawande
 This Test class contains the script to validate the Literature  Section are clickable 
 *and navigated to their pages
 */
public class AMPHindiLiteratureTest extends MobileCommonConfig{	
	/**
	 * @param serverType
	 * This method is used to verify the  LiteratureArticle present in the Home page of Mobile view
	 */
	@Test
	public void literatureArticleNavigation() {
		pages.ampHindiSanityLandingPage.verifyLiteratureArticleNavigation(serverType);
	}

}
