package com.news18.init;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


/**
 * @author AnupamGupta
 * This Class contains all the Webdriver functions   
 */
public class WebDriverActions extends DriverUtility{

	JavascriptExecutor js = (JavascriptExecutor)getDriver();
	public SoftAssert softAssert = new SoftAssert();

	/**
	 * @author AnupamGupta
	 * This method is used to click on element
	 * @param element
	 */
	public void click(WebElement element) {
		String url = getCurrentPageUrl();
		try {
			waitForElementVisibility(element, 10);
			waitForElementClickable(element, 10);
			element.click();
			Logs.info(getClass(), "Clicked on "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Possibily element is not Visible and not Clickable "+element, e);
			Assert.fail("Possibly Elements is not visible in "+url+" "+element);
		}
	}

	/**
	 * @author Sanjeeb Kumar Pati
	 * This method is used to wait for given time 
	 * @param time
	 */
	public void waitForSecond(int time)
	{
		try {
			Thread.sleep(time);
			Logs.info(getClass(), "Waiting till "+time);
		} catch (Exception e) {
			Logs.error(getClass(), "Time exceeded element not found", e);
		}
	}

	/**
	 * @author AnupamGupta
	 * This method is used to navigate to required URL 
	 * @param url
	 */
	public void navigateToUrl(String url) {
		try{
			getDriver().navigate().to(url);
			Logs.info(getClass(), "Navigated to "+ url);
		}catch(Exception e) {
			Logs.error(getClass(), "Not able to navigate to "+ url, e);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is used to fetch the current page URL
	 * @return String
	 */
	public String getCurrentPageUrl() {
		Logs.info(getClass(), "Fetching current page URL "+getDriver().getCurrentUrl());
		return getDriver().getCurrentUrl();
	}


	/**
	 * @author AnupamGupta
	 * This method is use to navigate back to the previous page
	 */
	public void navigateBack() {
		try {
			String pageURL = getCurrentPageUrl();
			getDriver().navigate().back();
			Logs.info(getClass(), "Navigated back from "+pageURL);
		} catch (Exception e) {
			Logs.error(getClass(), "Not able to navigate back ", e);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method will wait until element is visible
	 * @param element
	 * @param time
	 */
	public void waitForElementVisibility(WebElement element, int time) {
		String url = getCurrentPageUrl();
		try {
			//			WebDriverWait wait=new WebDriverWait(getDriver(), time);
			WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOf(element));   
			Logs.info(getClass(), "Wait for "+element +" till "+time);
		} catch (NoSuchElementException e) {
			Logs.error(getClass(), "Possibly Element is not visible ", e);
			Assert.fail("Possibly Elements is not visible in "+url+" "+element);
		}
	}



	/**
	 * @author AnupamGupta
	 * This method is used to wait till all Element is visible
	 * @param element
	 * @param time
	 */
	public void waitForAllElementsVisible(List<WebElement> element, int time) {
		String url = getCurrentPageUrl();
		try {
			//			WebDriverWait wait=new WebDriverWait(getDriver(), time);
			WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOfAllElements(element));
			Logs.info(getClass(), "Wait for list of "+element +" till "+time);
		} catch (Exception e) {
			Logs.error(getClass(), "Possibly Element is not visible ", e);
			Assert.fail("Possibly Elements is not visible in "+url+" "+element);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is use to mousehover to the element
	 * @param element
	 */
	public void mouseHover(WebElement element) {
		String url = getCurrentPageUrl();
		try {
			Actions action = new Actions(getDriver());
			action.moveToElement(element).perform();
			Logs.info(getClass(), "MouseHover to "+element);
		}
		catch(Exception e)
		{
			Logs.error(getClass(), "MouseHover unsuccessful as element is not visible in "+url+" "+element , e);
			Assert.fail("MouseHover unsuccessful as element is not visible in "+url+" "+element);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is used to double click on the element
	 * @param element
	 */
	public void doubleClick(WebElement element) {
		try {
			Actions action = new Actions(getDriver());
			action.doubleClick(element).perform();
			Logs.info(getClass(), "Doubled click on "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Not able to double click on "+element, e);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is used to input data to element 
	 * @param element
	 * @param data
	 */
	public void inputText(WebElement element, String data) {
		try {
			element.clear();
			element.sendKeys(data);
			Logs.info(getClass(), "Sent "+data+" to "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Unable to send "+ data + " to " +element, e);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is used to clear the text from element
	 * @param element
	 */
	public void toClearText(WebElement element) {
		try {
			element.clear();
			Logs.info(getClass(), "Cleared from "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Not able to clear on "+element, e);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is used to get text from Element
	 * @param element
	 * @return String
	 */
	public String getTextFromElement(WebElement element) {
		Logs.info(getClass(), "Getting text from "+element);
		return element.getText();
	}


	/**
	 * @author AnupamGupta
	 * This method is used for switching the frame
	 * @param frame
	 */
	public void switchToFrame(String frame) {
		try {
			getDriver().switchTo().frame(frame);
			Logs.info(getClass(), "Switched to frame "+frame);
		} catch (Exception e) {
			Logs.error(getClass(), "Not able to switch to "+frame, e);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is used to switch to particular window by comparing title
	 * @param partialTitle
	 */
	public void switchToWindow(String partialTitle) {
		Set<String> window = getDriver().getWindowHandles();
		Iterator<String> it = window.iterator();
		while(it.hasNext()) {
			String winId = it.next();
			String title = getDriver().switchTo().window(winId).getTitle();
			if(title.contains(partialTitle)) {
				break;
			}
		}
		Logs.info(getClass(), "Switched to window "+partialTitle);
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to switch to child window and comes back to parent window
	 */
	public void switchToParentWindow(){	
		String parent=getDriver().getWindowHandle();
		Set<String> windowHandles = getDriver().getWindowHandles();
		for(String window:windowHandles)
		{
			if(!window.equals(parent))
			{
				getDriver().switchTo().window(window);	
				Logs.info(getClass(), "Switched to child window ");
				waitForPageToLoad();
				getDriver().close();
			}
		}
		getDriver().switchTo().window(parent);
		Logs.info(getClass(), "Switched to parent window");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to switch to New window
	 */
	public void switchToNewWindow() {
		String window = "";
		java.util.Set<String> handles = getDriver().getWindowHandles();
		Iterator<String> ite = handles.iterator();
		while (ite.hasNext()) {
			window = (String) ite.next();
		}
		getDriver().switchTo().window(window);
		Logs.info(getClass(), "Switched to New window ");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to scroll to particular point
	 * @param x
	 * @param y
	 */
	public void scrollToPoint(int x, int y) {
		js.executeScript("window.scrollTo(" + x + "," + y + ")");
		Logs.info(getClass(), "scrolled to (" + x + "," + y + ")");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to scroll to the element
	 * @param element
	 */
	public void scrollToElement(WebElement element) {
		String url = getCurrentPageUrl();
		try {
			int y = element.getLocation().getY();
			js.executeScript("window.scrollTo(0," + y + ")");
			Logs.info(getClass(), "scrolled to "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "not able to scroll to "+element, e);
			Assert.fail("Not able to scroll in "+url+" "+element);
		}
	}


	/**
	 * @author Sanjeeb Kumar Pati
	 * This method is used to refresh the Page.
	 */
	public void refreshPage(){	
		getDriver().navigate().refresh();
		Logs.info(getClass(), "Page is refreshed");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to scroll to last of the page
	 */
	public void scrollToLast() {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Logs.info(getClass(), "scrolled to last");
	}


	/**
	 * @author AnupamGupta 
	 * This method is used to scroll down
	 */
	public void scrollDown() {
		js.executeScript("window.scrollBy(0,350)");
		Logs.info(getClass(), "scrolled down");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to scroll up
	 */
	public void scrollUp() {
		try {
			js.executeScript("window.scrollBy(0,-350)");
			Logs.info(getClass(), "scrolled up");
		} catch (Exception e) {
			Logs.error(getClass(), "not able to scroll up", e);
		}

	}


	/**
	 * @author AnupamGupta
	 * This method is used to take screenshot
	 * @param screenShotPath
	 * @return
	 */
	public String getScreenShot(String screenShotPath) {
		TakesScreenshot ts = (TakesScreenshot) getDriver();
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = screenShotPath + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			Logs.error(getClass(), "Capture Failed", e);
		}
		return path;
	}

	/**
	 * @author AnupamGupta
	 * This method is used to highlight the element
	 * @param element
	 */
	public void highlightElement(WebElement element) {
		String url = getCurrentPageUrl();
		try {
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
			Logs.info(getClass(), "highlighted the "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Not able to highlight "+element, e);
			Assert.fail("Not able to highlight in "+url+" "+element);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is used to get attribute from element
	 * @param attributeType
	 * @param element
	 * @return String
	 */
	public String getAttribute(String attributeType, WebElement element) {
		String text = "";
		if(attributeType.equalsIgnoreCase("value")) {
			text=element.getAttribute("value");
		}else if(attributeType.equalsIgnoreCase("innerText")) {
			text=element.getAttribute("innerText");
		}else if(attributeType.equalsIgnoreCase("textContent")) {
			text=element.getAttribute("textContent");
		}else if(attributeType.equalsIgnoreCase("title")) {
			text=element.getAttribute("title");
		}else if(attributeType.equalsIgnoreCase("galtitle")) {
			text=element.getAttribute("galtitle");
		}else if(attributeType.equalsIgnoreCase("id")) {
			text=element.getAttribute("id");
		}else if(attributeType.equalsIgnoreCase("src")) {
			text=element.getAttribute("src");
		}else if(attributeType.equalsIgnoreCase("srcset")) {
			text=element.getAttribute("srcset");
		}else if(attributeType.equalsIgnoreCase("href")) {
			text=element.getAttribute("href");
		}else if(attributeType.equalsIgnoreCase("alt")) {
			text=element.getAttribute("alt");
		}else if(attributeType.equalsIgnoreCase("data-slot")) {
			text=element.getAttribute("data-slot");
		}else if(attributeType.equalsIgnoreCase("class")) {
			text=element.getAttribute("class");
		}else if(attributeType.equalsIgnoreCase("type")) {
			text=element.getAttribute("type");
		}	
		else if(attributeType.equalsIgnoreCase("target")) {
			text=element.getAttribute("target");	
		}
		Logs.info(getClass(), "Fetching "+attributeType +" from "+element );
		return text;
	}


	/**
	 * @author AnupamGupta
	 * This method is used to click on element using javaScript
	 * @param element
	 */
	public void clickJS(WebElement element) {
		String url = getCurrentPageUrl();
		try {
			waitForElementVisibility(element, 10);
			waitForElementClickable(element, 10);
			js.executeScript("arguments[0].click();", element);
			Logs.info(getClass(), "clicked on "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Possibily element is not Visible and not Clickable "+element, e);
			Assert.fail("Possibily element is not Visible and not Clickable in "+url+" "+element);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is used to select visible text
	 * @param element
	 * @param option
	 */
	public void selectOption(WebElement element,String option) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(option);
			Logs.info(getClass(), "selected "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Unable to find "+option, e);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is used to load the page
	 */
	public void waitForPageToLoad() {
		try {
			do {
				pageLoadStatus = (String) js.executeScript("return document.readyState");
			} while (!pageLoadStatus.equals("complete"));
			Logs.info(getClass(), "Waiting for Page Load");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Logs.error(getClass(), "Page not loading or browser not responding ");
			Assert.fail("Page not loading or browser not responding ");
		}
	}


	/**
	 * @author VipinKumarGawande
	 * This method is use to wait for the element to be display 
	 * @param element
	 * @param time
	 * @return boolean
	 */
	public boolean isElementDisplayed(WebElement element) {
		try {
			waitForElementVisibility(element, 5);
			boolean status = element.isDisplayed();
			Logs.info(getClass(), "Element displayed "+element);
			return status;
		} catch (Exception e) {
			Logs.error(getClass(), "Element is not displayed");
			return false;
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is used to continuous scroll until element is visible
	 * @param element
	 * @param time
	 */
	public void continuousScrollTillElement(WebElement element, int time) {
		//		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		for(int count=0;count<=time;count++){
			try {
				//				WebDriverWait  wait=new WebDriverWait(getDriver(),sec3);
				WebDriverWait  wait=new WebDriverWait(getDriver(),Duration.ofSeconds(sec3));
				wait.until(ExpectedConditions.visibilityOf(element));
				Logs.info(getClass(), "Scrolls till element");
				break;
			}
			catch(Throwable e) {
				scrollDown();
			}
		}
	}


	/**
	 * @author Abhishek Raj
	 * This method is used to navigate to Current Url Source Code page
	 */
	public void viewPageSource() {
		String mainUrl = getDriver().getCurrentUrl();
		String sourceCodeURL = "view-source:" + mainUrl;
		getDriver().get(sourceCodeURL);  	
		Logs.info(getClass(), "Reads the page source");
	}

	/**
	 * @author DanishR
	 * This method is used to navigate to Current Url Source Code page
	 */
	public void viewPageSource(String mainUrl) {
		String sourceCodeURL = "view-source:" + mainUrl;
		getDriver().get(sourceCodeURL);  	
		Logs.info(getClass(), "Reads the page source "+mainUrl);
	}


	/**
	 * @author AnupamGupta
	 * This method is used to close the driver 
	 */
	public void closeDriver() 
	{
		getDriver().close();		
		Logs.info(getClass(), "Closed Current window");
	}


	/**
	 * @author AnupamGupta
	 * This method is used to get The Title of Page
	 */
	public String getPageTitle() 
	{
		Logs.info(getClass(), "Gets the title from the page");
		return getDriver().getTitle();		
	}


	/**
	 * @author Sanjeeb Kumar Pati
	 * This method will change the element Text To Lower Case. 
	 * @param element
	 */
	public String getTextToLowerCase(WebElement element){
		Logs.info(getClass(), "Change the text to lowercase");
		return element.getText().toLowerCase();
	}


	/**
	 * @author Sanjeeb Kumar Pati
	 * This method is used to wait till the element is clicked
	 * @param element
	 * @param time
	 */
	public void waitForElementClickable(WebElement element, int time) {
		//		WebDriverWait wait=new WebDriverWait(getDriver(), time);
		WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));   
		Logs.info(getClass(), "Wait for "+element +" till "+time);
	}


	/**
	 * @author AnupamGupta
	 * This method will used to scroll the mobile page 
	 * @param count
	 */
	public void mobileScroll(int count){
		for(int i=0;i<=count;i++) {
			try {
				js.executeScript("window.scrollBy(0,450)");
				Thread.sleep(1000);
			}
			catch (Exception e) {
				Logs.error(getClass(), "not able to scroll down", e);
			}	
		}
		Logs.info(getClass(), "scrolled down for "+count );
	}

	/****************************************Soft Assert methods***********************************************/

	/**
	 * @author AnupamGupta
	 * This method is used to click on element
	 * @param element
	 */
	public void softClick(WebElement element) {
		try {
			softWaitForElementVisibility(element, 10);
			waitForElementClickable(element, 10);
			element.click();
			Logs.info(getClass(), "Clicked on "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Possibily element is not Visible and not Clickable "+element+"For this URL"+getCurrentPageUrl(), e);
			//			softAssert.fail("Possibily element is not Visible and not Clickable "+element+"For this URL"+getCurrentPageUrl());
		}
	}


	/**
	 * @author AnupamGupta
	 * This method used to click on element using javaScript
	 * @param element
	 */
	public void softClickJS(WebElement element) {
		try {
			softWaitForElementVisibility(element, 10);
			waitForElementClickable(element, 10);
			js.executeScript("arguments[0].click();", element);
			Logs.info(getClass(), "clicked on "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Possibily element is not Visible and not Clickable "+element+ "For this URL"+getCurrentPageUrl(), e);
			//			Assert.fail("Possibily element is not Visible and not Clickable "+element);
			//			softAssert.fail("Possibily element is not Visible and not Clickable "+element);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method will wait until element is visible
	 * @param element
	 * @param time
	 */
	public void softWaitForElementVisibility(WebElement element, int time) {
		try {
			WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOf(element));   
			Logs.info(getClass(), "Wait for "+element +" till "+time);
		} catch (Exception e) {
			softAssert.fail("Possibly Element is not visible "+element);
		}
	}



	/**
	 * @author AnupamGupta
	 * This method is used to wait till all Element is visible
	 * @param element
	 * @param time
	 */
	public void softWaitForAllElementsVisible(List<WebElement> element, int time) {
		try {
			//			WebDriverWait wait=new WebDriverWait(getDriver(), time);
			WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOfAllElements(element));
			Logs.info(getClass(), "Wait for list of "+element +" till "+time);
		} catch (Exception e) {
			softAssert.fail("Possibly Element is not visible "+element);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is use to mousehover to the element
	 * @param element
	 */
	public void softMouseHover(WebElement element) {
		try {
			Actions action = new Actions(getDriver());
			action.moveToElement(element).perform();
			Logs.info(getClass(), "MouseHover to "+element);
		}
		catch(Exception e)
		{
			Logs.error(getClass(), "MouseHover unsuccessful to "+element , e);
			//			softAssert.fail("MouseHover unsuccessful to "+element);
		}
	}

	/**
	 * @author AnupamGupta
	 * This method is used to scroll to the element
	 * @param element
	 */
	public void softScrollToElement(WebElement element) {
		try {
			int y = element.getLocation().getY();
			js.executeScript("window.scrollTo(0," + y + ")");
			Logs.info(getClass(), "scrolled to "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "not able to scroll to "+element, e);
			//			softAssert.fail("not able to scroll to "+element);
		}
	}

	/**
	 * @author AnupamGupta
	 * This method is used to highlight the element
	 * @param element
	 */
	public void softHighlightElement(WebElement element) {
		try {
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
			Logs.info(getClass(), "highlighted the "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Not able to highlight "+element, e);
			//			softAssert.fail("Not able to highlight "+element);
		}
	}

	/**
	 * @author SanjeebKumarPati 
	 * This Method use to stop the page load.
	 */
	public void stopPageLoading() {
		Actions action = new Actions(getDriver());
		action.sendKeys(Keys.ESCAPE);
		Logs.info(getClass(), "Page Loading Stopped");
	}
	/**
	 * @author Danishr
	 * This method is use to display element
	 * @param element
	 * @return boolean
	 */
	public boolean softIsElementDisplayed(WebElement element, int time) {
		try {
			softWaitForElementVisibility(element, time);
			boolean status = element.isDisplayed();
			Logs.info(getClass(), "Element displayed "+element);
			return status;
		} catch (Exception e) {
			Logs.error(getClass(), "Element is not displayed "+element);
			//			softAssert.fail("Element is not displayed");
			return false;
		}
	}
	
	/**
	 * @author Danishr
	 * This method is use to display element
	 * @param element
	 * @return boolean
	 */
	public boolean softIsElementDisplayed(WebElement element) {
		try {
			softWaitForElementVisibility(element, 3);
			boolean status = element.isDisplayed();
			Logs.info(getClass(), "Element displayed "+element);
			return status;
		} catch (Exception e) {
			Logs.error(getClass(), "Element is not displayed "+element);
			//			softAssert.fail("Element is not displayed");
			return false;
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is used to navigate in new tab after clicking on the element
	 * @param element
	 */
	public void navigateToNewTab(WebElement element)
	{
		try {
			Actions action = new Actions(getDriver());
			waitForSecond(1000);
			action.keyDown(Keys.LEFT_CONTROL).click(element).keyUp(Keys.LEFT_CONTROL).build().perform();
			waitForSecond(1000);
			Logs.info(getClass(), "Navigate in new tab after clicking "+element);
		}
		catch(Exception e)
		{
			Logs.error(getClass(), "Possibly element is not visible "+element , e);
			softAssert.fail("Possibly element is not visible "+element);
		}
	}

	/**
	 * @author AnupamGupta
	 * This method is used to perform actions- mousehover and click on the element
	 * @param element
	 */
	public void mouseHoverAndClick(WebElement element) {
		try {
			Actions action = new Actions(getDriver());
			action.moveToElement(element).click().build().perform();
			Logs.info(getClass(), "MouseHover and clicked on  "+element);
		}
		catch(Exception e)
		{
			Logs.error(getClass(), "MouseHover and clicked unsuccessful to "+element , e);
			softAssert.fail("MouseHover and clicked unsuccessful to "+element);
		}
	}


	/**
	 * @author AnupamGupta
	 * This method is used to continuous scroll until list of element is visible
	 * @param element
	 * @param time
	 */
	public void continuousScrollTillAllElement(List<WebElement> element, int time) {
		//		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(20));
		for(int count=0;count<=time;count++){
			try {
				WebDriverWait  wait=new WebDriverWait(getDriver(),Duration.ofSeconds(sec3));
				wait.until(ExpectedConditions.visibilityOf(element.get(0)));
				Logs.info(getClass(), "Scrolls till element");
				break;
			}
			catch(Throwable e) {
				Assert.assertNotEquals(count, time, "Possibly element not found after "+count+" scroll");
				scrollDown();
			}
		}
	}


	/**
	 * @author AnupamGupta
	 * This method will wait for given time to load element
	 * @param time
	 */
	public void waitForElement(int time) {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		Logs.info(getClass(), "Wait for "+time);
	}
}
