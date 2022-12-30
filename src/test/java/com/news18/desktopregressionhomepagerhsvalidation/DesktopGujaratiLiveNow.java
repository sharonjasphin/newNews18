package com.news18.desktopregressionhomepagerhsvalidation;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;
/**
 * @author Rahul
 *This test class contains the script to validate the live now section
 *article navigation and slider navigation
 */
public class DesktopGujaratiLiveNow extends DesktopCommonConfig{

	/*This method is used to verify the live now article navigation */
	@Test
	public void liveNowArticle() {
		pages.desktopGujaratiLandingPage.verifyLiveNowArticle(serverType);
	} 
	
	/*This method is used to verify the live now slider navigation */
	@Test
	public void liveNowsliderNavigation() {
		pages.desktopGujaratiLandingPage.verifyLiveNowsliderNavigation(serverType);
	} 
}
