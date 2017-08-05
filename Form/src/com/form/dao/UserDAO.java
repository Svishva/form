package com.form.dao;
	
	/*
	 *  DAO for User Beans
	 *  
	 *  Contains all methods that are processed
	 *  on user  
	 *  methods : four
	 *  	createUser
	 * 		updateUser
	 * 		deleteUser
	 * 		getUser 
	 * 
	 *  @author visweshwarn
	 */

import com.form.model.beans.User;

public interface UserDAO {

	
	void createUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	User getUser(int UserID);
	
}
