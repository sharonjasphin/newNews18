package com.news18.mobilesanitybodyvalidation;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;

public class MobileGujaratiMobileAndTechWidgetTest extends MobileCommonConfig{

	/**
	 * @author 
	 * This method validates the Mobile and tech Article Navigation In Gujarati Homepage
	 */
	@Test
	public void verifyGujaratiMobileAndTechWidgetArticle() {
		pages.mobileGujaratiSanityLandingPage.verifyMobileAndTechWidgetArticle(this.serverType);        
	}
}
