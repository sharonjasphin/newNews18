package com.news18.izootoValidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author AbhishekRaj
 **This test Class contains scripts to verify the Izooto.js, present in various pages
 * of Desktop Urdu
 */

public class DesktopUrduIzootoTest extends DesktopCommonConfig{
	
	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to News18 HomePage for Urdu Language URL which is fetching from Property File
	 * URL - https://urdu.news18.com/
	 */
//	@BeforeMethod
	public void navigateToUrduHomePageUrl()
	{
		navigateToUrl(fileUtility.readDataFromPropertyFile("urduUrl"));
	}

	
	/**
	 * @author AbhishekRaj
	 * This method is used to validate the Izooto present in News18 HomePage for Urdu Language
	 * @throws InterruptedException 
	 */
	@Test
	public void verifyHomePageIzooto() throws InterruptedException 
	{
		String url = getCurrentPageUrl();
		pages.izootoValidatorPage.getNetworkLogs(url);	
	}
	

	/**
	 * @author AbhishekRaj
	 * This method is used to navigate to first Article excluding LiveBlog Article Links in News18 HomePage and 
	 * validate the Izooto present in HomePage Article 
	 * Consumption Page
	 * @throws InterruptedException 
	 */
	@Test
	public void verifyArticleIzooto() throws InterruptedException 
	{
		pages.desktopUrduLandingPage.clickOnFirstArticleHomePage();		//Click on First Article excluding LiveBlog Article
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
		pages.desktopUrduLandingPage.clickOnPhotosSection();  							// Click on Photo Section in Line One Menu
		pages.desktopUrduPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();	// Click on First PhotoGallery Article
		String url = getCurrentPageUrl();
		pages.izootoValidatorPage.getNetworkLogs(url);	
	}

}
