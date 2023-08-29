package com.project.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.project.dbutil.DBUtil;
import com.project.service.UserService;

@Service
public class UserServiceImpl  implements UserService {
	
	Connection connection;
	int flag = 0;
	public UserServiceImpl() throws SQLException {
		
		connection = DBUtil.getConnection();
		
	}

	@Override
	public int loginValidation(String username, String password) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE username = '"+username+"'");
			ResultSet rs = statement.executeQuery();
			
			while(rs.next())
			{
				if(rs.getString(1).equals(username) && rs.getString(2).equals(password)) {
					flag=1;
				}else {
					System.out.println("Invalid username/password");
					flag = 0;
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return flag;
	}
	
	
	
	
	
	

}
