import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class CorporateEmail {
	String url="jdbc:sqlserver://localhost:1433;databaseName=Records;integratedSecurity=true";

	public void fill_with_passwords(JTable table) {
			 
				try 
				{
					Connection c=DriverManager.getConnection(url);
					Statement st= c.createStatement();
					ResultSet rs=st.executeQuery("select Name,Email from Email");
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e) 
				{
					System.err.println("CorporateEmail.java Error");
					System.err.println(e.getMessage()); 
				}
			
		
	}
	
	public void searchQuery(String search,JTable table) {
		try 
		{
			Connection c=DriverManager.getConnection(url);
			Statement st= c.createStatement();
			ResultSet rs=st.executeQuery("select * from Email where Name like '%"+search+"%'"+" or Email like '%"+search+"%'");
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		}
		catch(Exception e) 
		{
			System.err.println("FillTable.java Error");
			System.err.println(e.getMessage()); 
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



