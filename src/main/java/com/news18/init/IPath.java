package com.news18.init;

/**
 * @author DanishR
 * This interface defines the common resources path
 */
public interface IPath {
	String propertyPath = ".//src/main/resources/PropertyReader.properties";
	String photoPath = ".//screenshot//";
	String extentReport = ".//extentreport//";
	String gaComscorePath=".//src/main/resources/gacomscore.json";
	String ampStatus="./ampvalidatefiles/ampstatus.txt";
	String ampHtmlPath="./ampvalidatefiles/ampsource.html";
//	String dbPath="jdbc:mysql://172.29.16.237:3306/psi";
//	String userName="psiuser";
//	String password="aZmeNeqas";
	
	String dbPath="jdbc:mysql://localhost:3306/psi";
	String userName="root";
	String password="root";
}
