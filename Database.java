import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JLabel;

public class Database {
	private String URL="jdbc:sqlserver://localhost:1433;databaseName=Records;integratedSecurity=true";
	static String dialog_message="";
	static String dialog_message1="";
	boolean errorMsg=false;
	
	
	public void add_device_to_database(String Date,String model,String SN,String license_duration,String Username,String Unit,String signature,String deviceCondition,String antiVirus,String OS) 
	{
		
		try 
		{
			Connection conn=DriverManager.getConnection(URL);
			PreparedStatement prest=conn.prepareStatement("insert into DeviceRecords(DateLogged,ModelName,SerialNumber,AntiVirusExpiryDate,Username,Department,Signature,DeviceCondition,AntiVirus,OS) values(?,?,?,?,?,?,?,?,?,?)");
			prest.setString(1, Date);
			prest.setString(2, model);
			prest.setString(3, SN);
			prest.setString(4, license_duration);
			prest.setString(5, Username);
			prest.setString(6, Unit);
			prest.setString(7, signature);
			prest.setString(8, deviceCondition);
			prest.setString(9, antiVirus);
			prest.setString(10, OS);
			prest.executeUpdate();
		}
		catch(Exception e) 
		{
			System.err.println("add_device_to_database() Error");
			System.err.println(e.getMessage());
		}
	}
	
	
	public void  remove_device_from_database(String SerialNumber) {
		
		try {
			Connection connect=DriverManager.getConnection(URL);
			PreparedStatement prest=connect.prepareStatement("delete from DeviceRecords where SerialNumber='"+SerialNumber+"'");
			prest.executeUpdate();
			
			
			
		}catch(Exception e) {
			System.err.println("remove_device_from_database()");
			System.err.println(e.getMessage());
			dialog_message1=e.getMessage().toString();
		}
		
	}
	
	
	public String get_number_department() {
		int count=0;
		
		try {
			Connection connect=DriverManager.getConnection(URL);
			Statement st=connect.createStatement();
			ResultSet rs=st.executeQuery("select count(Department) as 'number_of_department'from DeviceRecords");
			while(rs.next()) {
				count=rs.getInt("number_of_department");
			}
			
		}catch(Exception e) {
			System.err.println("get_number_department() Error");
			System.err.println(e.getMessage());
		}
		return String.valueOf(count);
	}
	
	
	public String get_condition() {
		int count=0;
		
		try {
			Connection connect=DriverManager.getConnection(URL);
			Statement st=connect.createStatement();
			ResultSet rs=st.executeQuery("select count(DeviceCondition) as 'number'from DeviceRecords where DeviceCondition="+"'Good'");
			while(rs.next()) {
				count=rs.getInt("number");
			}
			
		}catch(Exception e) {
			System.err.println("get_condition() Error");
			System.err.println(e.getMessage());
		}
		return String.valueOf(count);
	}
	
	public String get_OS() {
		int count=0;
		
		try {
			Connection connect=DriverManager.getConnection(URL);
			Statement st=connect.createStatement();
			ResultSet rs=st.executeQuery("select count(OS) as 'number'from DeviceRecords where OS="+"'Activated'");
			while(rs.next()) {
				count=rs.getInt("number");
			}
			
		}catch(Exception e) {
			System.err.println("get_OS() Error");
			System.err.println(e.getMessage());
		}
		return String.valueOf(count);
	}
	
	public String get_AntiVirus() {
		int count=0;
		
		try {
			Connection connect=DriverManager.getConnection(URL);
			Statement st=connect.createStatement();
			ResultSet rs=st.executeQuery("select count(AntiVirus) as 'number'from DeviceRecords where AntiVirus="+"'Activated'");
			while(rs.next()) {
				count=rs.getInt("number");
			}
			
		}catch(Exception e) {
			System.err.println("get_AntiVirus() Error");
			System.err.println(e.getMessage());
		}
		return String.valueOf(count);
	
	}
	
	public void add_corporate_email(String name,String emailAddress) {
		try 
		{
			Connection conn=DriverManager.getConnection(URL);
			PreparedStatement prest=conn.prepareStatement("insert into Email(Name,Email) values(?,?)");
			prest.setString(1, name);
			prest.setString(2, emailAddress);
			prest.executeUpdate();
		}
		catch(Exception e) 
		{
			errorMsg=true;
			System.err.println("add_corporate_email() Error");
			System.err.println(e.getMessage());
		}
	}
	
	public String get_department(String name) {
		int count=0;
		
		try {
			Connection connect=DriverManager.getConnection(URL);
			Statement st=connect.createStatement();
			ResultSet rs=st.executeQuery("select count(Department) as 'number'from DeviceRecords where Department="+"'"+name+"'");
			while(rs.next()) {
				count=rs.getInt("number");
			}
			
		}catch(Exception e) {
			System.err.println("get_Department(JLabel label) Error");
			System.err.println(e.getMessage());
		}
		return String.valueOf(count);
	
	}
	
	
	public String get_number_of_devices() {
		int count=0;
		
		try {
			Connection connect=DriverManager.getConnection(URL);
			Statement st=connect.createStatement();
			ResultSet rs=st.executeQuery("select count(SerialNumber) as 'number_of_devices'from DeviceRecords");
			while(rs.next()) {
				count=rs.getInt("number_of_devices");
			}
			
		}catch(Exception e) {
			System.err.println("get_number_of_devices() Error");
			System.err.println(e.getMessage());
		}
		return String.valueOf(count);
	}


	public String get_number_of_devices() {
		int count=0;
		
		try {
			Connection connect=DriverManager.getConnection(URL);
			Statement st=connect.createStatement();
			ResultSet rs=st.executeQuery("select count(SerialNumber) as 'number_of_devices'from DeviceRecords");
			while(rs.next()) {
				count=rs.getInt("number_of_devices");
			}
			
		}catch(Exception e) {
			System.err.println("get_number_of_devices() Error");
			System.err.println(e.getMessage());
		}
		return String.valueOf(count);
	}


	public void removeCorporateEmail(String name,String emailAddress) {
		try {
			Connection connect=DriverManager.getConnection(URL);
			PreparedStatement prest=connect.prepareStatement("delete from Email where Name='"+name+"'"+" and "+" Email="+"'"+emailAddress+"'");
			prest.executeUpdate();
			
			
			
		}catch(Exception e) {
			System.err.println("removeCorporateEmail()");
			System.err.println(e.getMessage());
			dialog_message1=e.getMessage().toString();
		}
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		
//		
//		
//		
//	}
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
