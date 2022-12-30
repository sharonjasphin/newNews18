package com.news18.init;

import java.sql.SQLException;
import java.util.ArrayList;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtility extends DBUtility implements ITestListener {
	String className;
	String current_className;
	int parentCount = 0;

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}


	//Summary Report variables
	int tcPass;
	int tcFail;
	String status;
	String curClassName;
	String curClassMethodName;
	ArrayList statusList=new ArrayList();
	String exception;
	String current_testName;
	String current_platformName;
	String s2;
	ITestResult result;
	

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		
		String methodName = result.getMethod().getMethodName().toString();
		current_className = result.getTestClass().getName().toString();
		current_className = current_className.substring(current_className.indexOf('c'), current_className.lastIndexOf("."));
		current_className = current_className.substring(current_className.lastIndexOf(".") + 1, current_className.length());

		System.out.println("==================================================");
		System.out.println("                 "+methodName+" Started           ");
		System.out.println("==================================================");
		
		String description = result.getMethod().getDescription();
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		exception = "NA";
		tcPass++;
		curClassName=result.getTestClass().getName().toString();
		curClassMethodName=result.getMethod().getMethodName().toString();
		current_className = result.getTestClass().getName().toString();
		current_className = current_className.substring(current_className.indexOf('c'), current_className.lastIndexOf("."));
		current_className = current_className.substring(current_className.lastIndexOf(".") + 1, current_className.length());
		String lang=checkLanguage(curClassName,curClassMethodName);//Extract Language by calling checklanguage method
		statusList.add(current_className);
		statusList.add(curClassMethodName);
		if(tcPass==1)
		{
			status="Pass";
		}
		statusList.add(status);

		try {
			String platformName = platform(result);
			insertIntoDB(current_className,platformName,curClassMethodName,status,lang,exception.replace("'", "\""));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println(statusList);
		tcPass=0;
		
		
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailure(result);
		exception=result.getThrowable().getMessage();
		//Below logic getting class,Method name and status pass/fail 
				curClassName=result.getTestClass().getName().toString();
				curClassMethodName=result.getMethod().getMethodName().toString();
				current_className = result.getTestClass().getName().toString();
				current_className = current_className.substring(current_className.indexOf('c'), current_className.lastIndexOf("."));
				current_className = current_className.substring(current_className.lastIndexOf(".") + 1, current_className.length());
				String lang=checkLanguage(curClassName,curClassMethodName);//Extract Language by calling checklanguage method
				tcFail++;
				curClassName=result.getTestClass().getName().toString();
				statusList.add(current_className);
				statusList.add(curClassMethodName);
				if(tcFail==1)
				{
					status="Fail";
				}
				try {
					String platformName = platform(result);
					insertIntoDB(current_className,platformName,curClassMethodName,status,lang,exception.replace("'", "\""));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				statusList.add(status);
				System.out.println(statusList);
				tcFail=0;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}
	
	
	public String platform(ITestResult result) {
		String s1 = result.getTestClass().getName().toString();
		System.out.println("String s1 is "+s1);
		String platform[] = s1.split("\\.");
		String methodname = platform[3].toString();

		//methodname = AMPEnglishValidation
		String plt ="";
		if(methodname.charAt(0)=='A') {

			plt = methodname.substring(0, 3);

		}
		else if(methodname.charAt(0)=='D') {

			plt = methodname.substring(0, 7);

		}
		else {
			plt = methodname.substring(0, 6);
		}
		return plt;
	}

}
