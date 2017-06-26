package com.structural.facade;

import java.sql.Connection;

public class HelperFacade {

	public static void generateReport(DBTypes dbType,ReportTypes reportType,String tableName){
		
		Connection con = null;
		
		switch(dbType){
		
		case MYSQL:
		
	    con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mySqlHelper = new MySqlHelper();
		
		switch(reportType){
		
		case HTML:
			System.out.println("the generated report in the html format from mysql db");
			mySqlHelper.generatedMySqlHTMLReport(tableName, con);
			break;
		
		case PDF:
			System.out.println("the generated report in the PDF format from mysql db");
			mySqlHelper.generatedMySqlPDFReport(tableName, con);
			break;
		}
		break;
		
		case ORACLE:
			
		    con = OracleHelper.getOracleDBConnection();
		    OracleHelper myOracleHelper = new OracleHelper();
			
			switch(reportType){
			
			case HTML:
				System.out.println("the generated report in the html format from oracle db");
				myOracleHelper.generatedOracleHTMLReport(tableName, con);
				break;
			
			case PDF:
				System.out.println("the generated report in the PDF format from oracle db");
				myOracleHelper.generatedOraclePDFReport(tableName, con);
				break;
			}
		
		}
	}
	
	public static enum DBTypes{
		MYSQL,ORACLE;
	}
	public static enum ReportTypes{
		HTML,PDF;
	}
}
