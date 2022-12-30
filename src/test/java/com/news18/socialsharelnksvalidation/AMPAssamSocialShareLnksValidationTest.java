package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social Share
 *Links Present on News 18 assam Page.
 */
public class AMPAssamSocialShareLnksValidationTest extends MobileCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for 
	 * assam Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("assamUrl"));
//	}
	
	
	/**
	 * This method is used to get valid AMP URL from current Page URL by navigating to View Page source
	 */
	public void changeToAmpURL()
	{
		String currentUrl = getCurrentPageUrl();
		String ampurl = pages.ampValidatorPage.getAmpHtml(currentUrl);
		navigateToUrl(ampurl);
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to Article consumption 
	 * Page and verify the Social Share links Present.
	 */
	@Test
	public void verifySocialShareLnksOnArticlePage()
	{
		pages.mobileAssamLandingPage.clickOnFirstArticleAssamHomePage();
		changeToAmpURL();
		pages.verifySocialShareIcons.verifyAMPSocialMediaNavigation();
	}

	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to photogallery article 
	 * consumption Page and verify the Social Share links Present.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnPhotoGalleryPage()
	{
		pages.mobileAssamLandingPage.clickOnPhotoSection();
		pages.mobileAssamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.verifySocialShareIcons.verifyAMPSocialMediaNavigation();
	}


}
