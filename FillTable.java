import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class FillTable {
	public void fill(JTable table) 
	{
		String url="jdbc:sqlserver://localhost:1433;databaseName=Records;integratedSecurity=true";
		try 
		{
			Connection c=DriverManager.getConnection(url);
			Statement st= c.createStatement();
			ResultSet rs=st.executeQuery("select * from DeviceRecords");
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		}
		catch(Exception e) 
		{
			System.err.println("FillTable.java Error");
			System.err.println(e.getMessage()); 
		}
		
	}
	
	public void searchQuery(String search,JTable table) {
		String url="jdbc:sqlserver://localhost:1433;databaseName=Records;integratedSecurity=true";
		try 
		{
			Connection c=DriverManager.getConnection(url);
			Statement st= c.createStatement();
			ResultSet rs=st.executeQuery("select * from DeviceRecords where Username like '%"+search+"%'"+" or SerialNumber like '%"+search+"%' or"+" Department like '%"+search+"%' "+"or ModelName like"+"'%"+search+"%'");
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		}
		catch(Exception e) 
		{
			System.err.println("FillTable.java Error");
			System.err.println(e.getMessage()); 
		}
	}
}
