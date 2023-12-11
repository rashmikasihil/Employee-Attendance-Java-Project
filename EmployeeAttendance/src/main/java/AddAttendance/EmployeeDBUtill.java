package AddAttendance;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDBUtill {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static List <attendance> validate(String EmpID,String date){
		
		ArrayList <attendance> att = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from attendance where EmpID='"+EmpID+"' and Date='"+date+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				String ID = rs.getString(1);
				String Date = rs.getString(2);
				String firstHalf = rs.getString(3);
				String secondHalf = rs.getString(4);
				
				attendance a = new attendance(ID,Date,firstHalf,secondHalf);
				att.add(a);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return att;
	}
	
	
	

	public static boolean addAttendance(String EmpID,String Date,String firstHalf,String secondHalf) {
		
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();		
			String sql = "insert into attendance values('"+EmpID+"','"+Date+"', '"+firstHalf+"', '"+secondHalf+"');";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean updateAttendance(String EmpID,String Date,String firstHalf,String secondHalf) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update attendance set firstHalf='"+firstHalf+"', secondHalf='"+secondHalf+"' where EmpID='"+EmpID+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
		
	}
	
	
	public static List<attendance> getAttendanceDetails(String id,String date){
		
		ArrayList <attendance> att = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from attendance where EmpID='"+id+"' and Date='"+date+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String ID = rs.getString(1);
				String Date = rs.getString(2);
				String firstHalf = rs.getString(3);
				String secondHalf = rs.getString(4);
				
				attendance a = new attendance(ID,Date,firstHalf,secondHalf);
				att.add(a);

			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return att;
	}

}
