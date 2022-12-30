package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social 
 *Share Links Present on News 18 english Page.
 */
public class AMPEnglishSocialShareLnksValidationTest extends MobileCommonConfig {

	/**
	 * This method is used to navigate to News18 Home Page for 
	 * English Language URL which is fetching from Property File
	 *  URL-https://news18.com/
	 */
//	@BeforeMethod
//	public void navigateToNews18Homepage()
//	{
//		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
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
		pages.mobileLandingPage.clickOnFirstArticleHomePage();
		changeToAmpURL();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.ampArticleConsumptionPage.getAMPEnglishSocialShareIconsLnk(), pages.ampArticleConsumptionPage.getAMPEnglishAllShareIcons());
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to Live Blog Page and 
	 * verify the Social Share links Present for AMP veiw.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnLiveBlogPage()
	{
		pages.ampLandingPage.clickOnFirstLiveBlogArticleHomePage();
		changeToAmpURL();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.ampLandingPage.getSocialShareIconsLnks(),pages.ampLandingPage.getAllShareIcons());
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
		pages.mobileLandingPage.clickOnPhotoSection();
		pages.mobilePhotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();
		changeToAmpURL();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.ampPhotoArticleConsumptionPage.getAMPEnglishSocialShareIconsLnk(),pages.ampPhotoArticleConsumptionPage.getAMPEnglishAllShareIcons());
	}
	
	
}
