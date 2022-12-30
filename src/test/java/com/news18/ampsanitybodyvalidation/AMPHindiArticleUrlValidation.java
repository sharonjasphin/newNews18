package com.news18.ampsanitybodyvalidation;

import org.testng.annotations.Test;

import com.news18.init.MobileCommonConfig;

public class AMPHindiArticleUrlValidation extends MobileCommonConfig{

	@Test
	public void ArticleUrl() {
		pages.ampHindiSanityLandingPage.verifyArticleUrl();
		
	}
}
