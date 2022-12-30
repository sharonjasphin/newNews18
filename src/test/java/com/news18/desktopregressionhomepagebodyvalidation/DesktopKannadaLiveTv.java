package com.news18.desktopregressionhomepagebodyvalidation;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;
/**
 * @author AnupamGupta
 *This Test class contains the script to validate the functionalities of the Live Tv section of Desktop
 *present at the Header of the Home page
 */
public class DesktopKannadaLiveTv extends DesktopCommonConfig{

	/**
	 * This method is used to verify the functionalities of the Live Tv Section present 
	 * at the RHS of the Home page
	 * @throws InterruptedException
	 */
	@Test
	public void liveTv() throws InterruptedException {
		pages.desktopKannadaLandingPage.verifyLiveTv();
	}
	
	/**
	 * This method is used to click on the Live Tv Header present at the Header of the 
	 * Home Page
	 */
	@Test
	public void liveTvHeader() {
		pages.desktopKannadaLandingPage.verifyLiveTvHeadline(serverType);
	}
}