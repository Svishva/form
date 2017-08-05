/**
 * 
 */
package com.form.dao.implementation.mongodb;

import com.form.dao.UserDAO;
import com.form.model.beans.User;

/**
 * DAO implementation for Beans : User.java
 * Target Database : MongoDB
 * 
 * has four methods
 * 		createUser
 * 		updateUser
 * 		deleteUser
 * 		getUser
 * 
 * @author visweshwaran
 *
 */
public class UserDAOImpMongoDB implements UserDAO {

	/* create a user on controller redirect here
	 * to Register a user info
	 * 
	 * @param User
	 * 
	 * @see com.form.dao.UserDAO
	 * #createUser(com.form.model.beans.User)
	 */
	@Override
	public void createUser(User user) {

	}

	/* 
	 * Modify User information 
	 * @see com.form.dao.UserDAO
	 * #updateUser(com.form.model.beans.User)
	 */
	@Override
	public void updateUser(User user) {

	}

	/* (non-Javadoc)
	 * @see com.form.dao.UserDAO
	 * #deleteUser(com.form.model.beans.User)
	 */
	@Override
	public void deleteUser(User user) {

	}

	/* (non-Javadoc)
	 * @see com.form.dao.UserDAO
	 * #getUser(int)
	 */
	@Override
	public User getUser(int UserID) {
		return null;
	}

}
