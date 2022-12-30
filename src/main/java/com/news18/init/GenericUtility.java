package com.news18.init;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;

/**
 *@author Abhishek Raj
 *This class is used to call all the common methods required for tests
 *getDateTime,generateRandomNumber,compareTwoStrings
 */

public class GenericUtility {

	public static String sDirPath = System.getProperty("user.dir");

	/**
	 * @author Abhishek Raj
	 * Method is used to get current date and Time format using Date,Simple Date Format java.text
	 * @return String
	 */
	public static String getDateTime() 
	{
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateOfExecution = dateFormat.format(date);
		Logs.info(GenericUtility.class,"Current DateTime: "+ dateOfExecution);
		return dateOfExecution;
	}


	/**
	 * @author Abhishek Raj
	 * Method is used to get Current Time using Date Class java.util.Date
	 * @return String
	 */

	public String getCurrentTime()
	{
		Date date = new Date();
		String value = date.toString();
		String[] split = value.split(" ");
		String str=split[3];
		Logs.info(getClass(),"Current Time: "+ str);
		return str;
	}


	/**
	 * @author Abhishek Raj
	 * Method is used to get Current Date using Date Class java.util.Date
	 * @return String
	 */

	public String getCurrentDate()
	{
		Date date = new Date();
		String value = date.toString();
		String[] split = value.split(" ");
		String day= split[2];
		String month=split[1];
		String year=split[5];
		String tdate=day+month+year;
		Logs.info(getClass(),"Current Date: "+ tdate);
		return tdate;
	}


	/**
	 * @author Abhishek Raj
	 * Method is used for generate Random Number using Random Class java.util
	 * @return int
	 */

	public int generateRandomNumber()
	{
		Random r= new Random();
		Logs.info(getClass(),"Random Number Upto 1000: "+r.nextInt(1000)); 
		return r.nextInt(1000);
	}


	/**
	 * @author SanjeebKumarPati
	 * Method is used to calculate the difference between system time and article time using Date,Simple Date Format java.text
	 * @param articleDate
	 * @return String
	 * @throws ParseException 
	 * @throws Exception
	 */
	public long dateTimeDifference(String articleDate) {
		try {
			//Fetching system current date and time
			SimpleDateFormat sdfDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			Date now = new Date();
			String strDate = sdfDate.format(now);
			Date d1 = sdfDate.parse(strDate);
			//Converting article time and date format to system format
			articleDate = articleDate.replace("IST", "").replace(" ", "");
			Logs.info(getClass(), articleDate);
			if(articleDate.contains("|")) {
				articleDate = articleDate.replace("|", "");
			}
			if(articleDate.contains("FirstPublished")) {
				articleDate = articleDate.replace("FirstPublished:", "");
			}
			if(articleDate.contains("FIRSTPUBLISHED")) {
				articleDate = articleDate.replace("FIRSTPUBLISHED:", "");
			}
			if(articleDate.toLowerCase().contains("lastupdated")) {
				articleDate = articleDate.replace("LASTUPDATED:", "");

				if(articleDate.toLowerCase().contains("pm")) {
					articleDate = articleDate.replace("PM", "");
					int l=articleDate.length();
					String hour = articleDate.substring(l-5, l-3);
					int hour1=Integer.parseInt(hour)+12;
					articleDate=articleDate.substring(0, l-5)+","+hour1+articleDate.substring(l-3);

				}else if(articleDate.toLowerCase().contains("am")) {
					articleDate = articleDate.replace("AM", "");
					int l=articleDate.length();
					articleDate=articleDate.substring(0, l-5)+","+articleDate.substring(l-5);
				}
			}
			Logs.info(getClass(), articleDate);
			SimpleDateFormat sdf1 = new SimpleDateFormat("MMMMdd,yyyy,HH:mm");
			Date date1 = sdf1.parse(articleDate);
			DateFormat outputformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			String output = outputformat.format(date1);
			Date d2 = sdfDate.parse(output);
			//Difference between article time and current times
			long diff=d1.getTime()-d2.getTime();
			long minutes=(diff/(1000*60));
			Logs.info(getClass(),"Date Time Difference "+minutes); 
			return minutes;
		}
		catch(ParseException e){
			Assert.fail("Date And Time Format Mismatch");
		}
		return 0;	
	}


	/**
	 * @author SanjeebKumarPati
	 * Method is used to get Article Time using Date Class java.util.Date
	 * @return time
	 */
	public String getArticleDate(String date)
	{
		String time ="";
		for (int i = 0; i <date.length(); i++)
		{
			if(date.charAt(i)==':')
			{
				time = date.substring(i-2, i+3);		
			}
		}
		return time;
	}


	/**
	 *@author Abhishek Raj
	 *Method is used for comparing 2 strings using contains java.lang
	 * @param actual
	 * @param expected
	 * @return boolean
	 */

	public boolean compareTwoStrings(String actual,String expected)
	{	
		Logs.info(getClass(),"Compare Two String "+ actual.contains(expected)); 
		return actual.contains(expected);		
	}


	/**
	 * @author Abhishek Raj
	 * Method is used for comparing 2 strings using equal ignore case java.lang
	 * @param actual
	 * @param expected
	 * @return boolean
	 */
	public boolean compareStringsWithIgnoreCase(String actual,String expected)
	{	
		Logs.info(getClass(),"Compare Two String "+ actual.equalsIgnoreCase(expected));
		return actual.equalsIgnoreCase(expected);		
	}


	/**
	 * @author Abhishek Raj
	 * Method is used for Converting String using Substring java.lang
	 * @param i
	 * @param j
	 * @param text
	 * @return String
	 */
	public String getSubstring(int i,int j,String text) {
		String s= new String(text);
		String sub= s.substring(i, j);
		Logs.info(getClass(),"change Substring to String "+sub); 
		return sub;
	}


	/**
	 * @author Abhishek Raj
	 * Method is used for display System Date and Time using DateTimeFormatter java.time.format
	 * @return String
	 */
	public String getSystemDateTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd");
		String date = LocalDateTime.now().format(formatter);
		String[] split = date.split(" ");
		int d= Integer.parseInt(split[1]);
		String str= Integer.toString(d);
		String expectedDate=split[0]+" "+str;
		Logs.info(getClass(),"Fetches system DateTime");
		return expectedDate;

	}

	/**
	 * @author Rahul Kulkarni
	 * Method is used for display System Date and Time using DateTimeFormatter java.time.format
	 * @return String
	 */
	public  String getStreamUrlDateFormat() 
	{
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String dateOfExecution = dateFormat.format(date);
		Logs.info(GenericUtility.class,"Current DateTime: "+ dateOfExecution);
		return dateOfExecution;
	}

	/**
	 * @author Abhishek Raj
	 * Method is used for comparing 2 strings using Equals java.lang
	 * @param actual
	 * @param expected
	 * @return boolean
	 */
	public boolean compareStringsWithEquals(String actual,String expected)
	{	
		Logs.info(getClass(),"Compare Two String "); 
		return actual.equals(expected);		
	}


	/**
	 * @author Abhishek Raj
	 * Method is used for slicing the string using split java.lang
	 * @param text
	 * @return String
	 */
	public String split(String text, int i, String text2 ) {
		String s= new String(text);
		String [] str=s.split(text2);
		Logs.info(getClass(), str[i]); 
		return str[i];
	}


	/**
	 * @author Abhishek Raj 
	 * This method is used to validate the schema
	 * @param url
	 * @throws IOException
	 * @throws InterruptedException
	 */

	public void validateSchema(String url) throws IOException, InterruptedException {
		int warning = 0;
		int failed = 0;
		Process proc = Runtime.getRuntime().exec("cmd /c sdtt --url " + url);
		proc.waitFor();
		BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		String line = reader.readLine();
		while (line != null) {
			if (line.contains("Warnings:")) {
				warning = Integer.parseInt(line.replace("Warnings:", "").replace(" ", "").split("	")[0]);
			}
			if (line.contains("Failed:")) {
				failed = Integer.parseInt(line.replace("Failed:", "").replace(" ", "").split("	")[0]);
			}
			line = reader.readLine();
		}
		if (warning == 0 && failed ==0) {
			Logs.info(getClass(),"Warning is "+warning +" and Failed is "+failed );
		}
		else {
			Assert.fail("Structured schema has warnings : "+warning + " and Failures has " +failed);
		}
	}





	/**
	 * @author Abhishek Raj
	 * This Method is used to Get Text From Json Files
	 * @param filePath
	 * @param jSONPath
	 * @return String
	 */
	public String getTextFromJsonFiles(String filePath, String jSONPath) {
		ObjectMapper mapper=new ObjectMapper();
		String text=null;
		try {
			text = mapper.readTree(new File(filePath)).at(jSONPath).asText();
			Logs.info(getClass(), "Json file text is "+ text);
		} catch (IOException e) {
			Logs.error(getClass(), "Failed to get Json file text "+text,e);
		}
		return text;
	}


	/**
	 * @author AbhishekRaj
	 * This Method is used to Get Int From Json Files
	 * @param filePath
	 * @param jSONPath
	 * @return int
	 */
	public int getIntFromJsonFiles(String filePath, String jSONPath) {
		ObjectMapper mapper=new ObjectMapper();
		int value=0;
		try {
			value = mapper.readTree(new File(filePath)).at(jSONPath).asInt();
			Logs.info(getClass(),"Json file integer value is "+ jSONPath);
		} catch (IOException e) {
			Logs.error(getClass(), "Failed to get Json file integer value "+value,e);
		}
		return value;
	}


	/**
	 * @author Abhishek Raj
	 * This method is used for create a new file
	 * @param path
	 * @return file
	 */
	public FileWriter fileWriter(String path) {
		FileWriter file=null;
		try {
			file =new  FileWriter(path);
			Logs.info(getClass(),"Created a new file in path " +path);
		} catch (IOException e) {
			Logs.error(getClass(), "Faile to create a new file "+file,e);
		}
		return file;
	}


	/**
	 * @author AnupamGupta
	 * This method is used to check file contain given text
	 * @param filePath
	 * @param text
	 * @return
	 */
	public boolean fileContainText(String filePath , String text) {
		ObjectMapper mapper=new ObjectMapper();
		boolean value;
		try {
			value = mapper.readTree(new File(filePath)).toString().contains(text);
			Logs.info(getClass(),"Comparing file text "+ text);
		} catch (IOException e) {
			Logs.error(getClass(), "Failed to find text "+e);
			return false;
		}
		return value;
	}


	/**
	 * @author AnupamGupta
	 * This method is used to parse string to JSONObject
	 * @param stringToParse
	 * @return
	 */
	public JSONObject parseToJSONObject(String stringToParse) {
		JSONObject jsonObject = null;
		JSONParser parser = new JSONParser();
		try {
			jsonObject = (JSONObject) parser.parse(stringToParse);
		} catch (Exception e) {
			Logs.error(getClass(),"unable to Parse the LogEntries");
		}
		return jsonObject;
	}

	/**
	 * @author Rahul Kulkarni
	 * @param jsonPathEvaluator
	 * @param jsonPathExpr
	 * @return
	 */
	public List<String> getJsonPath(JsonPath jsonPathEvaluator, String jsonPathExpr) {

		List url = null;
		try {
			url = jsonPathEvaluator.get(jsonPathExpr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertTrue(url!=null,"jsonPath does not contain"+jsonPathExpr+"for url"+url);
		}
		return url;

	}

	/**
	 * @param currentClassName
	 * @return language
	 * @author Rahul Kulkarni
	 * Below method is used to extract language from MethodName of Test Method
	 */
	public String checkLanguage(String currentClassName,String currentClassMethodName) {
		String lang;
		if(currentClassName.contains("english")||currentClassName.contains("English")||currentClassMethodName.contains("english")||currentClassMethodName.contains("English"))
		{
			lang="English";
			return lang;
		}
		else if(currentClassName.contains("hindi")||currentClassName.contains("Hindi")||currentClassMethodName.contains("hindi")||currentClassMethodName.contains("Hindi"))
		{

			lang="Hindi";
			return lang;
		}
		else if(currentClassName.contains("kannada")||currentClassName.contains("Kannada")||currentClassMethodName.contains("kannada")||currentClassMethodName.contains("Kannada"))
		{

			lang="Kannada";
			return lang;
		}
		else if(currentClassName.contains("lokmat")||currentClassName.contains("Lokmat")||currentClassName.contains("Marathi")||currentClassMethodName.contains("lokmat")||currentClassMethodName.contains("Lokmat"))
		{

			lang="Lokmat";
			return lang;
		}
		else if(currentClassName.contains("malayalam")||currentClassName.contains("Malayalam")||currentClassMethodName.contains("malayalam")||currentClassMethodName.contains("Malayalam"))
		{

			lang="Malayalam";
			return lang;
		}else if(currentClassName.contains("odia")||currentClassName.contains("Odia")||currentClassMethodName.contains("odia")||currentClassMethodName.contains("Odia"))
		{

			lang="Odia";
			return lang;
		}
		else if(currentClassName.contains("punjabi")||currentClassName.contains("Punjab")||currentClassName.contains("Punjab")||currentClassMethodName.contains("punjab")||currentClassMethodName.contains("Punjab")||currentClassMethodName.contains("punjabi"))
		{

			lang="Punjab";
			return lang;
		}
		else if(currentClassName.contains("assam")||currentClassName.contains("Assam")||currentClassMethodName.contains("assam")||currentClassMethodName.contains("Assam"))
		{

			lang="Assam";
			return lang;
		}else if(currentClassName.contains("bengali")||currentClassName.contains("Bengali")||currentClassMethodName.contains("bengali")||currentClassMethodName.contains("Bengali"))
		{

			lang="Bengali";
			return lang;
		}
		else if(currentClassName.contains("gujarati")||currentClassName.contains("Gujarati")||currentClassMethodName.contains("Gujarati")||currentClassMethodName.contains("gujarati"))
		{

			lang="Gujarati";
			return lang;
		}
		else if(currentClassName.contains("tamil")||currentClassName.contains("Tamil")||currentClassMethodName.contains("tamil")||currentClassMethodName.contains("Tamil"))
		{

			lang="Tamil";
			return lang;
		}
		else if(currentClassName.contains("telugu")||currentClassName.contains("Telugu")||currentClassMethodName.contains("telugu")||currentClassMethodName.contains("Telugu"))
		{

			lang="Telugu";
			return lang;
		}
		else if(currentClassName.contains("urdu")||currentClassName.contains("Urdu")||currentClassMethodName.contains("urdu")||currentClassMethodName.contains("Urdu"))
		{

			lang="Urdu";
			return lang;
		}
		else if(currentClassName.contains("All")||currentClassMethodName.contains("all"))
		{

			lang="All";
			return lang;
		}
		else {

			return null;
		}
	}

	public void findDateTimeDifference(String url) throws ParseException
	{
//		url="https://hindi.news18.com/sitemaps/daily/2022-11-02.xml";

		//Create a new object of DocumentBuilderFactory  
		//pass Url to open stream to read xml
		Document doc = null;
		long differenceMinutes;
		long differenceHours = 0;
		long differenceDays = 0;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			//Create an object DocumentBuilder to parse the XML file data
			DocumentBuilder db = dbf.newDocumentBuilder();

			doc = db.parse(new URL(url).openStream());
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SAXException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  

		
		String loc=doc.getElementsByTagName("loc").item(0).getTextContent();
		System.out.println(loc);
	}


	public  void getDifference(String pubDate,String latestBuildDate,String url, String articleLink) {

		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		long differenceMinutes;
		long differenceHours = 0;
		long differenceDays = 0;
		try {

			// parse method is used to parse
			// the text from a string to
			// produce the date
			Date d1 = sdf.parse(pubDate);
			Date d2 = sdf.parse(latestBuildDate);

			// Calculate time difference
			// in milliseconds
			long difference_In_Time	= d2.getTime() - d1.getTime();
			System.out.println("difference in milliseconds : "+difference_In_Time);

			// Calculate time difference in
			// seconds, minutes, hours, years,
			// and days
			//		        long differenceSeconds = difference_In_Time / 1000 % 60;
			differenceMinutes = difference_In_Time / (60 * 1000) % 60;
			differenceHours = difference_In_Time / (60 * 60 * 1000) % 24;
			differenceDays = difference_In_Time / (24 * 60 * 60 * 1000);

			// Print the date difference in
			// years, in days, in hours, in
			// minutes, and in seconds

			System.out.println("Difference between two dates is: ");

			System.out.println( differenceDays+ " Days ");
			System.out.println( differenceHours+ " Hours ");
			System.out.println( differenceMinutes+ " Minutes ");
		}

		// Catch the Exception
		catch (ParseException e) {
			e.printStackTrace();
		}

		Assert.assertTrue(differenceDays==0,"Published date is more than 2 hours for url:"+url+" with difference of  "+differenceDays+" days,LastestBuildDate is"+latestBuildDate+" and PubDate is"+pubDate+" for article link :"+articleLink);
		if(url.contains("UP.xml") || url.contains("Bihar.xml") || url.contains("Rajasthan.xml") || url.contains("MP.xml") || url.contains("Haryana.xml") || url.contains("Himachal.xml") || url.contains("uk.xml") || url.contains("jharkhand.xml")  || url.contains("chhattisgarh.xml") || url.contains("https://bengali.news18.com/rss/fb.xml")){

			Assert.assertTrue(differenceHours>-2 && differenceHours<2  ,"Published date is more than 2 hours for url:"+url+" with difference of : "+differenceHours+" hours, current LatestBuildDate is :"+latestBuildDate+", PubDate is :"+pubDate+" ArticleLink :"+articleLink);
		}
		else if(url.contains("https://hindi.news18.com/rss/fb.xml") || url.contains("https://hindi.news18.com/rss/fb/hindi.xml") || url.contains("gujarati") || url.contains("lokmat") || url.contains("assam") || url.contains("tamil") || url.contains("telugu") || url.contains("kannada") || url.contains("malayalam") || url.contains("punjab") || url.contains("urdu") || url.contains("odia") || url.contains("https://news18.com/rss/fb.xml") || url.contains("tech") || url.contains("world") || url.contains("lifestyle") || url.contains("auto") || url.contains("showsha")) {
			Assert.assertTrue( differenceHours>-1 && differenceHours<1,"Published date is more than 1 hours for url:"+url+" with difference of : "+differenceHours+" hours, current LatestBuildDate is :"+latestBuildDate+", PubDate is :"+pubDate+" ArticleLink :"+articleLink);
		}
	}
	
	public String replaceInUrl(String url) {
		if ((!(url.contains("beta"))) && (url.contains("https://www.news18.com/"))) {
			url=url.replace("www", "beta");
			return url;
		}
		else if ((!(url.contains("beta"))) && (url.contains("hindi"))) {
			url=url.replace("hindi", "betahindi");
			return url;
		}
		else if ((!(url.contains("beta"))) && (url.contains("bengali"))) {
			url=url.replace("bengali", "betabengali");
			return url;
		}
		else if ((!(url.contains("beta"))) && (url.contains("punjab"))) {
			url=url.replace("punjab", "betapunjabi");
			return url;
		}
		else if ((!(url.contains("beta"))) && (url.contains("gujarati"))) {
			url=url.replace("gujarati", "betagujarati");
			return url;
		}
		else if ((!(url.contains("beta"))) && (url.contains("kannada"))) {
			url=url.replace("kannada", "betakannada");
			return url;
		}		
		else if ((!(url.contains("beta"))) && (url.contains("tamil"))) {
			url=url.replace("tamil", "betatamil");
			return url;
		}
		else if ((!(url.contains("beta"))) && (url.contains("telugu"))) {
			url=url.replace("telugu", "betatelugu");
			return url;
		}
		else if ((!(url.contains("beta"))) && (url.contains("lokmat"))) {
			url=url.replace("lokmat", "betalokmat");
			return url;
		}
		else if ((!(url.contains("beta"))) && (url.contains("urdu"))) {
			url=url.replace("urdu", "betaurdu");
			return url;
		}
		else if ((!(url.contains("beta"))) && (url.contains("odia"))) {
			url=url.replace("odia", "betaodia");
			return url;
		}	
		else if ((!(url.contains("beta"))) && (url.contains("assam"))) {
			url=url.replace("assam", "betaassam");
			return url;
		}
		else if ((!(url.contains("beta"))) && (url.contains("malayalam"))) {
			url=url.replace("malayalam", "betamalayalam");
			return url;
		}
		else {
			return url;
		}
	}
	
	
	/**
	 * This method is used to set the clipboard text from the application content
	 * @param aString
	 */
	public void setClipboardContents( String aString ){
		  StringSelection stringSelection = new StringSelection( aString );
		  Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		  clipboard.setContents( stringSelection, (ClipboardOwner) this );
		}
	
	/**
	 * This method is used to copy the text from the application content
	 * @return
	 */
	public String getClipboardContents() {
		  String result = "";
		  Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		  //odd: the Object param of getContents is not currently used
		  Transferable contents = clipboard.getContents(null);
		  boolean hasTransferableText =
		    (contents != null) &&
		    contents.isDataFlavorSupported(DataFlavor.stringFlavor)
		  ;
		  if ( hasTransferableText ) {
		    try {
		      result = (String)contents.getTransferData(DataFlavor.stringFlavor);
		    }
		    catch (UnsupportedFlavorException ex){
		      //highly unlikely since we are using a standard DataFlavor
		      System.out.println(ex);
		      ex.printStackTrace();
		    }
		    catch (IOException ex) {
		      System.out.println(ex);
		      ex.printStackTrace();
		    }
		  }
		  return result;
		}
	
	/**
	 * @author SanjeebKumarPati
	 * This Method Is use to compare Urls.
	 */

	/**
	 * @author SanjeebKumarPati
	 * This Method Is use to compare Urls.
	 */
	public boolean compareUrlSub(String url,String actual)
	{
		ArrayList<String> list=new ArrayList<>();
		int count = 0;
		boolean flag=false;
		String[] arrOfStr = url.split(".com/");
		if(arrOfStr.length==1)
		{
			list.add(url);	
		}
		else
		{	
			String str1=" "+arrOfStr[1];
			String str = str1.replaceAll("/", " ").replaceAll("-", " ");
			String[] url1=str.split(" ");
			for(int i=1;i<url1.length;i++)
			{
				list.add(url1[i]);
			}
			if(list.size()==0)
			{
				list.add(url);
			}
		}
		Logs.info(getClass(), list);
		if(list.size()<3)
		{
			for(int j=0;j<list.size();j++)
			{
				Logs.info(getClass(), actual);
				if(actual.contains(list.get(j)))
				{
					count++;
					if(count>0)
					{
						flag=true;

					}
				}
			}
			return flag;
		}
		else
		{
			for(int j=0;j<list.size();j++)
			{
				Logs.info(getClass(), actual);
				if(actual.contains(list.get(j)))
				{
					count++;
					if(count>2)
					{
						flag=true;
						return flag;	
					}
				}
			}
		}
		return flag;
	}
}



