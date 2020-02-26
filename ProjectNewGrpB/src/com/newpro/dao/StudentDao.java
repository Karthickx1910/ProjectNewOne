package com.newpro.dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {
	
private static final String SELECT_ALL_USERS = "select * from state";
	
	/*private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet resultSet = null;

	
	public List<Student> selectAllUsers(){
		Student register=null;
		List<Student> users=new ArrayList<>();
		
		try{
			connection=ConnectionFactory.getConnection();
			statement=connection.prepareStatement(SELECT_ALL_USERS);
			System.out.println(statement);
			resultSet=statement.executeQuery();
			while(resultSet.next()){
				
				Integer stateId=resultSet.getInt("ID");
				String stateName=resultSet.getString("NAME");
				
				users.add(new State(stateId, stateName));
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
*/

}
