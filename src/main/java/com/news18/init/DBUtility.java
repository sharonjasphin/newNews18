package com.news18.init;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class DBUtility extends GenericUtility implements IPath {

	public Connection con=null;
	public int id=0;
	/**
	 * Method to connect to DataBase creating Connection through DriverManager Class
	 * @throws Throwable
	 */
	public void  dbConnect() throws Throwable {
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		con=DriverManager.getConnection(dbPath,userName,password);
	}
	
	public void insertIntoDB(String current_className, String platformName, String curClassMethodName,String status,String lang, String exceptionMsg) throws SQLException {
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = null;
		Statement stat = con.createStatement();

		/* Getting last inserted record ID Number value from table psi_all_lang, and insert new values by 
		  incrementing ID variable. */	

		String getLastId="SELECT id from news18summaryreport order by id desc limit 1;";

		ResultSet result1 = stat.executeQuery(getLastId);
		while(result1.next())
		{
			id=result1.getInt(1);
		}
		id++;
		
		query="insert into news18summaryreport(Id,DateTime,ScenarioName,PlatformName,TestMethodName,Status,Language,FailureReason) values("+id+",now(),'"+current_className+"','"+platformName+"','"+curClassMethodName+"','"+status+"','"+lang+"','"+exceptionMsg+"')";
		
		double result = stat.executeUpdate(query);
		
		if(result==1)
		{
			System.out.println("1 row inserted");
		}
		else
		{
			System.out.println("Row failed to insert");
		}
		
		dbConnectionClose();
	}

	/**
	 * @param lang
	 * @param tableName
	 * @return
	 * @throws Throwable
	 */
	public  List<String> dbGetUrls(String section) throws Throwable
	{
		
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> list=new ArrayList<String>();

		Statement stat = con.createStatement();
		String query="select *from base_api_urls where section='"+section+"';";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			list.add(result.getString("url"));
		}
		result.close();
		stat.close();
		return list;	
	}
	
	public void dbConnectionClose() throws SQLException {
		con.close();
	}
}
