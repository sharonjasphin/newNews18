package com.news18.socialsharelnksvalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 *@author SanjeebKumarPati
 *This Test Class contains scripts to verify Social 
 *Share Links Present on News 18 english Page.
 */
public class DesktopEnglishSocialShareLnksValidationTest extends DesktopCommonConfig {

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
	 * @author SanjeebKumarPati
	 * This method is used to navigate to Article consumption Page 
	 * and verify the Social Share links Present.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnArticlePage()
	{
		pages.desktopLandingPage.clickOnFirstArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopArticleConsumptionPage.getSocialShareIconsLnk(),pages.desktopArticleConsumptionPage.getAllShareIcons());
	}
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to Live Blog Page and 
	 * verify the Social Share links Present.
	 * 
	 */
	@Test
	public void verifySocialShareLnksOnLiveBlogPage()
	{
		pages.desktopLandingPage.clickOnFirstLiveBlogArticleHomePage();
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopLiveblogPage.getSocialShareIconsLnks(),pages.desktopLiveblogPage.getAllShareIcons());
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
		pages.desktopLandingPage.clickOnPhotosSection();
		pages.desktopphotoGalleryConsumptionPage.navigateToOldPhotogalleryFirstArticle();;
		pages.verifySocialShareIcons.verifySocialMediaNavigation(pages.desktopphotoGalleryConsumptionPage.getSocialShareIconsLnks(),pages.desktopphotoGalleryConsumptionPage.getAllShareIcons());
	}
	
	
}
