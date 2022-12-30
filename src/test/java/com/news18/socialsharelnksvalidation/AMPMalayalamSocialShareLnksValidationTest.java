package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social Share 
 *Links Present on News 18 malayalam Page.
 */
public class AMPMalayalamSocialShareLnksValidationTest extends MobileCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for 
	 * malayalam Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("malayalamUrl"));
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
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnArticlePage()
	{
		pages.mobileMalayalamLandingPage.clickOnFirstArticleMalayalamHomePage();
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
		pages.mobileMalayalamLandingPage.clickOnPhotoSection();
		pages.mobileMalayalamPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.verifySocialShareIcons.verifyAMPSocialMediaNavigation();
	}
	
}
