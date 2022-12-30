package com.news18.ampsanitybodyvalidation;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;
/**
 * @author VipinKumarGawande
 This Test class contains the script to validate the Super Hit Gallery  Section are clickable 
 *and navigated to their pages
 */
public class AMPHindiAjabGajab extends MobileCommonConfig{
	
	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to verify the ajabHeadline present in the Home page of Mobile view
	 */
	@Test
	public void ajabArticleNavigation() {
		pages.ampHindiSanityLandingPage.verifyAjabArticleNavigation(serverType);
	}
	
}
