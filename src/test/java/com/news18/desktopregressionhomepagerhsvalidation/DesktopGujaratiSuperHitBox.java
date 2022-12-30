package com.news18.desktopregressionhomepagerhsvalidation;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;
/**
 *@author Rahul
 *This test class contains the script to validate the superhit box section
 *article navigation and slider navigation
 */
public class DesktopGujaratiSuperHitBox extends DesktopCommonConfig{

	/*This method is used to verify the superhit article navigation present at the RHS*/
	@Test
	public void superHitArticleLnk() {
		pages.desktopGujaratiLandingPage.verifySuperHitArticleLnk(serverType);
	}
	
	/*This method is used to verify the superhit slider navigation present at the RHS*/
	@Test
	public void superhitSliderNavigation() {
		pages.desktopGujaratiLandingPage.verifySuperhitSliderNavigation(serverType);
	} 
}


