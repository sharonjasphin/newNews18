package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social Share Links 
 *Present on News 18 kannada Page.
 */
public class AMPKannadaSocialShareLnksValidationTest extends MobileCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for 
	 * kannada Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("kannadaUrl"));
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
	 * This method is used to navigate to Article consumption Page 
	 * and verify the Social Share links Present.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnArticlePage()
	{
		pages.mobileKannadaLandingPage.clickOnFirstArticleKannadaHomePage();
		changeToAmpURL();
		pages.verifySocialShareIcons.verifyAMPSocialMediaNavigation();
	}
	
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to photogallery article consumption 
	 * Page and verify the Social Share links Present.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnPhotoGalleryPage()
	{
		pages.mobileKannadaLandingPage.clickOnPhotoSection();
		pages.mobileKannadaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.verifySocialShareIcons.verifyAMPSocialMediaNavigation();
	}
	
	
}
