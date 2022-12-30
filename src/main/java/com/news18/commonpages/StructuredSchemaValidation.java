package com.news18.commonpages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek Raj
 *This class contains the buisiness logic to validate schema structure for Desktop, Mobile and Amp mode
 */
public class StructuredSchemaValidation{
	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();

	public StructuredSchemaValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/**
	 * @author Abhishek Raj
	 * This method ise used to validate schema structure in Desktop and mobile mode
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void schemaValidation() throws IOException, InterruptedException {
		genericUtility.validateSchema(webDriverActions.getCurrentPageUrl());

	}


	/**
	 * @author Abhishek Raj
	 * This method ise used to validate schema structure in Amp mode
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void ampSchemaValidation() throws IOException, InterruptedException  {
			genericUtility.validateSchema(webDriverActions.getCurrentPageUrl());
		
	}
}

