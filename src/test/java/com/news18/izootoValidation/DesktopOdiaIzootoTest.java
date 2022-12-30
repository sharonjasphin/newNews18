package com.news18.izootoValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author AbhishekRaj
 **This test Class contains scripts to verify the Izooto.js, present in various pages
 * of Desktop Odia
 */
public class DesktopOdiaIzootoTest extends DesktopCommonConfig{
	
	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 Home Page for Odia Language URL which is fetching from Property File
	 * URL - https://odia.news18.com/
	 */
//	@BeforeMethod
	public void navigateToOdiaHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("odiaUrl"));
	}


	/**
	 * @author AbhishekRaj
	 * This method is used to verify the Promoted Content Ads and Image And OutBrain Content 
	 * is displayed/Loading in News18 HomePage for Odia Language 
	 * @throws InterruptedException 
	 */
	@Test
	public void verifyHomePageOutbrain() throws InterruptedException 
	{
		String url = getCurrentPageUrl();
		pages.izootoValidatorPage.getNetworkLogs(url);	
	}

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to first Article excluding LiveBlog Article Links in News18 HomePage and 
	 * verify the Promoted Content Ads and OutBrain Content is displayed/Loading in HomePage Article 
	 * Consumption Page
	 * @throws InterruptedException 
	 */
	@Test
	public void verifyArticleIzooto() throws InterruptedException 
	{
		pages.desktopOdiaLandingPage.clickOnFirstArticleHomePage(); 	// Click on First Article excluding LiveBlog 
		String url = getCurrentPageUrl();
		pages.izootoValidatorPage.getNetworkLogs(url);	
	}

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate Photos section and Click on the first PhotoGallery Article in News18 PhotoGallery Page 
	 * and validate the Izooto present in PhotoGallery Article 
	 * Consumption Page
	 * @throws InterruptedException 
	 */
	@Test
	public void verifyPhotoGalleryIzooto() throws InterruptedException 
	{
		pages.desktopOdiaLandingPage.clickOnPhotosSection();  								// Click on Photo Section in Line One Menu
		pages.desktopOdiaPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();		// Click on First PhotoGallery Article
		String url = getCurrentPageUrl();
		pages.izootoValidatorPage.getNetworkLogs(url);	
	}

}
