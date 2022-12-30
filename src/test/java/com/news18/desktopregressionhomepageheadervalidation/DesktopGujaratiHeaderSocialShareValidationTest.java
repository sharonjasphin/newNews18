package com.news18.desktopregressionhomepageheadervalidation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class DesktopGujaratiHeaderSocialShareValidationTest extends DesktopCommonConfig {


	/**
	 * @author SanjeebKumarPati
	 * This method is used to validate Social Media links present on HomePage Header
	 */
	@Test
	public void headerSocialShare() {
		pages.desktopGujaratiLandingPage.headerFollowUSSectionValidation();
	}

}
