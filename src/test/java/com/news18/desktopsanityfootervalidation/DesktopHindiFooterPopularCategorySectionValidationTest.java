package com.news18.desktopsanityfootervalidation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * This Class Contains scripts to verify the  footer Section elements Present at the Header Part of HomePage.
 * @author SanjeebKumarPati
 * URL-https://www.news18.com/
 */
public class DesktopHindiFooterPopularCategorySectionValidationTest extends DesktopCommonConfig {

	/**
	 * @author SanjeebKumarPati
	 * This method is used to navigate to News18 Home Page for Hindi
	 * Language URL which is fetching from Property File
	 * URL-https://www.news18.com/
	 */
	//@BeforeMethod
	public void navigateToEnglishHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	
	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Footer Popular Category Sections present In hindi News18 HomePage
	 */
	@Test
	public void footerPopularCategorySectionValidation () {
		pages.desktopHindiSanityLandingPage.verfyFooterPopularCategorySection(serverType);
	}
}
