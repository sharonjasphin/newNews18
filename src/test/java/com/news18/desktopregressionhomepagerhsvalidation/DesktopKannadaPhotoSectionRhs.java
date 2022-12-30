package com.news18.desktopregressionhomepagerhsvalidation;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author Rahul
 *This test class contains the method to validate the Photo Section Articles and Headline
 *present at the RHS of the Home Page
 */
public class DesktopKannadaPhotoSectionRhs extends DesktopCommonConfig{

	/**
	 * This method is used to verify the Photo Section Headline present at the 
	 * RHS of the Home Page
	 */
	@Test
	public void photoSectionHeadline() {
		pages.desktopKannadaLandingPage.verifyPhotoSectionHeadline(serverType);	
	}

	/**
	 * This method is used to verify the Photo Section articles present at the RHS 
	 * of the Home Page
	 */
	@Test
	public void photoArticleList() {
		pages.desktopKannadaLandingPage.verifyPhotoArticleList(serverType);	
	}	
}
