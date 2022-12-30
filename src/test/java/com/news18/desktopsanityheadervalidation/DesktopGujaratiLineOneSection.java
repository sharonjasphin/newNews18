package com.news18.desktopsanityheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author
 * This class Contains Test Files for Gujarati Language Line one section Navigation
 */
public class DesktopGujaratiLineOneSection extends DesktopCommonConfig{

	/**
	 * @author 
	 * This method is used to validateLine one section Validation present at the Header Part In Gujarati News18 HomePage
	 */
	@Test
	public void lineOneSection() {
		pages.desktopGujaratiSanityLandingPage.verfyLineOneSection(serverType);
	}
}
