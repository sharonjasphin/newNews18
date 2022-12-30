package com.news18.init;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author VipinKumar
 *This class is used to initialize all the common Variables required for tests
 */
public class GlobalVariables extends DBUtility {

	protected FileUtility fileUtility = new FileUtility();

	// Logger Variables
	public static Logger logger = null;
	//Live and Pre-Prod Urls
	public static String serverType=null;
		

	//Properties Variables
	public final String desktop = fileUtility.readDataFromPropertyFile("platformdesktop");
	public final String mobile = fileUtility.readDataFromPropertyFile("platformmobile");
	public final String amp = fileUtility.readDataFromPropertyFile("platformamp");
	public final String chrome = fileUtility.readDataFromPropertyFile("browser");
	public static FileInputStream inputStream;
	public static Properties properties;
	public static String propertiesFileName = "src\\main\\resources\\EnvironmentVariables\\Config.properties";

	//wait Variables
	public static final int ITO=30;
	public static final int sec3=3;
	public static final int sec60=60;
	public static final int sec30=30;
	public static String pageLoadStatus = "";
}