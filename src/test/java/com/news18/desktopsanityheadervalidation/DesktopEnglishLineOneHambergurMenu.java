package com.news18.desktopsanityheadervalidation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

	public class DesktopEnglishLineOneHambergurMenu extends DesktopCommonConfig{

		@Test
		public void lineOneHamburger() {
			pages.desktopSanityLandingPage.verfyLineOneHamburgerMenu(serverType);
		}
}
