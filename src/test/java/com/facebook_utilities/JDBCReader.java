package com.facebook_utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.HashMap;

public class JDBCReader {

	public synchronized HashMap<String, String> getSqlResultInMap(String sqlQuery) { 
        HashMap<String, String> data_map = new HashMap<>();

		try{  
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			//make sure to change the url from your data base
			// make sure to change data base name
			String url ="jdbc:sqlserver://DESKTOP-INQUNRP\\MSSQLSERVER;"+"databaseName=FaruqAcademy;";

			String user="Faruq"; //change user name
			String password="1234";  //change password
			Connection con=DriverManager.getConnection(url,user,password); 		

			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery(sqlQuery);  
            ResultSetMetaData rmd = rs.getMetaData();
             System.out.println(rs); // how many data set 
            while (rs.next()) {            
                for (int i = 1; i <= rmd.getColumnCount(); i++) {
                    data_map.put(rmd.getColumnName(i), rs.getString(i));
                }
            }
            System.out.println(data_map); // print all the map
			con.close();  
		}catch(Exception e){ System.out.println(e);}
		return data_map;  
	}  
public String selectColumnName(String EnterColumnName) {
	//make sure to change select statement
	String selectStudenOne = "SELECT * FROM [FaruqAcademy].[dbo].[Students] where studentId=1";
	JDBCReader db = new JDBCReader();
	HashMap<String, String> dbData=db.getSqlResultInMap(selectStudenOne);
	dbData.get(EnterColumnName);
	System.out.println(dbData.get(EnterColumnName));
	return selectStudenOne;	
}

public String selectColumnNameForStudentTwo(String EnterColumnName) {
	//make sure to change select statement
	String selectStudenOne = "SELECT * FROM [FaruqAcademy].[dbo].[Students] where studentId=2";
	JDBCReader db = new JDBCReader();
	HashMap<String, String> dbData=db.getSqlResultInMap(selectStudenOne);
	dbData.get(EnterColumnName);
	System.out.println(dbData.get(EnterColumnName));
	return selectStudenOne;	
}

//if you want to make row number dynamic
public String selectColumnNameForStudent(String EnterColumnName, int RowNum) {
	//make sure to change select statement
	String selectStudenOne = "SELECT * FROM [FaruqAcademy].[dbo].[Students] where studentId="+RowNum;
	JDBCReader db = new JDBCReader();
	HashMap<String, String> dbData=db.getSqlResultInMap(selectStudenOne);
	dbData.get(EnterColumnName);
	System.out.println(dbData.get(EnterColumnName));
	return selectStudenOne;	
}


	public static void main(String[] args) {
		String sid1 = "SELECT * FROM [FaruqAcademy].[dbo].[Students] where studentId=1";
		String sid2 = "SELECT * FROM [FaruqAcademy].[dbo].[Students] where studentId=2";
		String select = "SELECT * FROM Students";
		JDBCReader db = new JDBCReader();
		HashMap<String, String> dbData=db.getSqlResultInMap(sid1);
		System.out.println(dbData.get("firstname"));
		System.out.println(dbData.get("phone"));
		
		HashMap<String, String> dbData2=db.getSqlResultInMap(sid2);
		System.out.println(dbData2.get("firstname"));
		System.out.println(dbData2.get("lastname"));
		System.out.println(dbData2.get("phone"));
		System.out.println(dbData2.get("phone"));
		System.out.println(dbData2.get("enrolldate"));
		System.out.println(dbData2.get("studentId"));

}
}
