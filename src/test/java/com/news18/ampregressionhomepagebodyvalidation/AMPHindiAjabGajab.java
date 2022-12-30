package com.news18.ampregressionhomepagebodyvalidation;
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
	public void ajabHeadline() {
		pages.ampHindiLandingPage.verifyAjabHeadline(serverType);
	}
	
	/**
	 * @author VipinKumarGawande
	 * @param serverType
	 * This method is used to verify the ajabHeadline present in the Home page of Mobile view
	 */
	@Test
	public void ajabArticleNavigation() {
		pages.ampHindiLandingPage.verifyAjabArticleNavigation(serverType);
	}
	
	/**
	 *@author VipinKumarGawande
	 * @param serverType
	 * This method is used to verify the ajabReadMore present in the Home page of Mobile view
	 */
	@Test
	public void ajabReadMore() {
		pages.ampHindiLandingPage.verifyAjabReadMore(serverType);
	}
}
