package com.works.twodays.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.works.twodays.props.User;
import com.works.twodays.util.Material;

@Service
public class UserModel {
	@Autowired 
	Connection db;
	
	
	public boolean loginControl(User us) {
		boolean statu = false;
		try {
			String query = "select * from user where umail = ? and upass = ?";
			PreparedStatement ps = db.prepareStatement(query);
			ps.setString(1, us.getUmail());
			ps.setString(2, Material.MD5(us.getUpass()));
			ResultSet rs = ps.executeQuery();
			statu = rs.next();
			
		} catch (Exception e) {
			System.err.println("Login error:"+e);
		}
		
		return statu;
	}
}
