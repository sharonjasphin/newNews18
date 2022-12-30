package com.news18.ampregressionhomepagebodyvalidation;

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
	 * This method is used to verify the literatureHeadline present in the Home page of Mobile view
	 */
	@Test
	public void literatureHeadline() {
		pages.ampHindiLandingPage.verifyLiteratureHeadline(serverType);
	}
	
	/**
	 * @param serverType
	 * This method is used to verify the  LiteratureArticle present in the Home page of Mobile view
	 */
	@Test
	public void literatureArticleNavigation() {
		pages.ampHindiLandingPage.verifyLiteratureArticleNavigation(serverType);
	}
	
	/**
	 * @param serverType
	 * This method is used to verify the  literatureReadMore present in the Home page of Mobile view
	 */
	@Test
	public void literatureReadMore() {
		pages.ampHindiLandingPage.verifyLiteratureReadMore(serverType);
	}
}
