package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social Share Links 
 *Present on News 18 telugu Page.
 */
public class MobileTeluguSocialShareLnksValidationTest extends MobileCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for 
	 * telugu Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("teluguUrl"));
//	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to Article consumption Page 
	 * and verify the Social Share links Present.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnArticlePage()
	{
		pages.mobileTeluguLandingPage.clickOnFirstArticleTeluguHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobileTeluguArticleConsumptionPage.getSocialShareIconsLnk(),pages.mobileTeluguArticleConsumptionPage.getAllShareIcons());
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
		pages.mobileTeluguLandingPage.clickOnPhotoSection();
		pages.mobileTeluguPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();;
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.mobileTeluguPhotogalleryConsumptionPage.getSocialShareIconsLnk(), pages.mobileTeluguPhotogalleryConsumptionPage.getAllShareIcons());
	}
	
	
}
