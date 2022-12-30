package com.news18.desktopsanitybodyvalidation;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author 
 * This class contains methods to validate the pages are in new stack
 */
public class DesktopGujaratiNewStack  extends DesktopCommonConfig{

	/**
	 * This method is used to validate the method that is in Home page
	 */
	@Test
	public void homePageNewStack() {
		pages.desktopGujaratiSanityLandingPage.verifyHomepageNewStack();
	}
	
	/**
	 * This method is used to validate the tage page is in the new stack
	 */
//	@Test
	public void tagPageNewStack() {
		pages.desktopGujaratiSanityLandingPage.verifyTagPageNewStack(serverType);
	}
	/**
	 * This method is used to validate the Photogallery page is in the new stack
	 */
	@Test
	public void photogalleryPageNewStack() {
		pages.desktopGujaratiSanityLandingPage.verifyPhotogalleryPageNewStack(serverType);
	}
	
	/**
	 * This method is used to validate the Video page is in the new stack
	 */
	@Test
	public void videoPageNewStack() {
		pages.desktopGujaratiSanityLandingPage.verifyVideoPageNewStack(serverType);
	}
}
