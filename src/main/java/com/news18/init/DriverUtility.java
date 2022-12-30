package com.news18.init;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class contains method to launch and close the driver
 * and the driver actions.
 * @author Sanjeeb
 *
 */
public class DriverUtility extends GlobalVariables {
	public static ThreadLocal<WebDriver> tdriver =  new ThreadLocal<WebDriver>();

	ChromeOptions opt =new ChromeOptions();

	/**
	 * @author SanjeebKumarPati
	 * This Method is used to launch the browser
	 * @param browserName
	 */
	public void launchWebBrowser(String browserName, String platformName){
		try
		{
			if(browserName.equalsIgnoreCase("chrome") && platformName.equalsIgnoreCase("desktop")) {
				Logs.info(getClass(), "Launching Chrome Browser in Desktop view");
				setDriver();
			}
			else if (browserName.equalsIgnoreCase("chrome") && platformName.equalsIgnoreCase("mobile")) {
				Logs.info(getClass(), "Launching Chrome Browser in Mobile view");
				switchToMobView(fileUtility.readDataFromPropertyFile("mobileType"));
				setDriver();
			}
		}
		catch(Exception e)
		{
			Logs.error(getClass(), "Failed to launch the browser", e);
		}
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to switch to mobile web view
	 * @param mobileType
	 */
	public void switchToMobView(String mobileType) {
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", mobileType);
		opt.setExperimentalOption("mobileEmulation", mobileEmulation);
		Logs.info(getClass(), "Launched in mobile view");
	}


	/**
	 * @author SanjeebKumarPati
	 * This method is used to handle all chrome options 
	 */
	public WebDriver setChromeOptions() {
		WebDriver driver;
		LoggingPreferences preferences = new LoggingPreferences();
		preferences.enable(LogType.PERFORMANCE, Level.ALL);
		opt.addArguments("--window-size=1920,1080");
		opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-web-security");
		opt.addArguments("--disable-gpu");
		opt.addArguments("--disable-popup-blocking");
		opt.addArguments("--allow-running-insecure-content");
		opt.addArguments("--ignore-certificate-errors");
		opt.addArguments("--headless");
		opt.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36");
		opt.setCapability(CapabilityType.LOGGING_PREFS, preferences);
		opt.setCapability("goog:loggingPrefs", preferences);
		opt.addArguments();
		Logs.info(getClass(), "Launched Chrome Browser");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ITO));
//		driver.manage().timeouts().pageLoadTimeout(ITO, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(ITO));
		return driver;
	}

	/**
	 * @author RahulK
	 * 
	 */
	public void setDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver webdriverlocal = setChromeOptions();
		tdriver.set(webdriverlocal);
	}

	public static  WebDriver getDriver() {
		 return tdriver.get();
	}

	/**
	 * @author Abhishek
	 * This method returns All the log Entries.
	 * @return Log entries
	 */
	public LogEntries getAllNetworkLog() {
		return getDriver().manage().logs().get(LogType.PERFORMANCE);
	}


	/**
	 * @author SanjeebKumarPati
	 * Close All The Browser
	 */
	public void closeAllDriver() {
		Logs.info(getClass(), "Closing Browser");
		getDriver().quit();
	}
}