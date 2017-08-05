
package com.form.dao.implementation.mongodb.dbconnect;

import com.mongodb.MongoClient;

/**
 * To connect to Mongo DB this provides 
 * Singleton pattern using Private Constructor
 * 
 *  import this and call getInstance()
 * 
 * @author system18
 *
 */
public class FormDatabaseMongoDB {
	
	
	  private  static final MongoClient mc = new MongoClient( "localhost" , 27017 );

	  public final MongoClient getInstance(){
		
		System.out.println("Form Database getInstance() executed");
		return mc;
	
	}
}
	


