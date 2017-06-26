package com.structural.facade;

import java.sql.Connection;

public class FacadeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tableName ="Employee";
		
		Connection con = MySqlHelper.getMySqlDBConnection();
		MySqlHelper mysqlhelper = new MySqlHelper();
		mysqlhelper.generatedMySqlHTMLReport(tableName, con);
		
		
		
		Connection con1 = MySqlHelper.getMySqlDBConnection();
		OracleHelper oraclehelper = new OracleHelper();
		oraclehelper.generatedOraclePDFReport(tableName, con1);
		
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
		
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
	}

}
