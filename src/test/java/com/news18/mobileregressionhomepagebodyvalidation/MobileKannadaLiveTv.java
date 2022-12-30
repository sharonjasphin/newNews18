package com.news18.mobileregressionhomepagebodyvalidation;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;
/**
 * @author AnupamGupta
 *This Test class contains the script to validate the functionalities of the Live Tv section of Desktop
 *present at the Home page
 */
public class MobileKannadaLiveTv extends MobileCommonConfig{

	/**
	 * @throws InterruptedException
	 * This method is used to verify the Live Tv section present at the Home Page
	 */
	@Test
	public void liveTv() throws InterruptedException {
		pages.mobileKannadaLandingPage.verifyLiveTv();	
	}
	
	/**
	 * This method is used to click on the Live Tv Header present at the Header of the 
	 * Home Page
	 */
	@Test
	public void liveTvHeader() {
		pages.mobileKannadaLandingPage.verifyLiveTvHeadline(serverType);
	}
}
