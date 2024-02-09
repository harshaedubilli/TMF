package banking.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import banking.DTO.UserDTO;



public class UserDAO {
	
	public boolean insertUserDetails(UserDTO user) throws ClassNotFoundException
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String DB_URL = "jdbc:mysql://localhost:3306/banking";
			String DB_USER = "root";
			String DB_PASSWORD = "root";
			Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			
			String s1="insert into User_info(username,password,user_fullname,mobile_no,email_ID,user_address) values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(s1);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getUser_fullname());
			ps.setString(4, user.getMobile_no());
			ps.setString(5, user.getEmail_ID());
			ps.setString(6, user.getUser_address());
			
			int rowsAffected = ps.executeUpdate();
			return rowsAffected>0;
			
		}
		 
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return false;
		
	}
	
}