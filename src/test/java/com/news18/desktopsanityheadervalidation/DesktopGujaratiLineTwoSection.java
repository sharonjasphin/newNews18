package com.news18.desktopsanityheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author
 * This class Contains Test Files for Gujarati Language Line two section Navigation
 */
public class DesktopGujaratiLineTwoSection extends DesktopCommonConfig{

	/**
	 * @author 
	 * This method is used to validate Line two section Validation present at the Header Part In Gujarati News18 HomePage
	 */
	@Test
	public void lineTwoSection() {
		pages.desktopGujaratiSanityLandingPage.verfyLineTwoSection(serverType);
	}
}
