package com.newpro.dao;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.newpro.helper.ConnectionFactory;
import com.newpro.model.Student;

public class StudentDao {
	
private static final String SELECT_ALL_USERS = "select * from student";
	
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet resultSet = null;

	
	public List<Student> selectAllUsers(){
		
		List<Student> users=new ArrayList<>();
		
		try{
			connection=ConnectionFactory.getConnection();
			statement=connection.prepareStatement(SELECT_ALL_USERS);
			System.out.println(statement);
			resultSet=statement.executeQuery();
			while(resultSet.next()){
				
				String studentName=resultSet.getString("NAME");
				Integer marks=resultSet.getInt("ID");
				
				
				users.add(new Student(studentName, marks));
			}
		}catch(SQLException e){
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
		
	}


}
