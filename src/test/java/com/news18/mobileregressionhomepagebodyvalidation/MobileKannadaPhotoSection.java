package com.news18.mobileregressionhomepagebodyvalidation;
import org.testng.annotations.Test;
import com.news18.init.MobileCommonConfig;
/**
 * @author Rahul
 *This test class contains the method to validate the Photo Section Articles and Headline
 *present in the Home Page
 */
public class MobileKannadaPhotoSection extends MobileCommonConfig{

	/**
	 * This method is used to verify the Photo Section Headline present at the 
	 * RHS of the Home Page
	 */
	@Test
	public void photoSectionHeadline() {
		pages.mobileKannadaLandingPage.verifyPhotoSectionHeadline(serverType);	
	}

	/**
	 * This method is used to verify the Photo Section articles present at the RHS 
	 * of the Home Page
	 */
	@Test
	public void PhotoArticleList() {
		pages.mobileKannadaLandingPage.verifyPhotoArticleList(serverType);	
	}	
}
