package com.form.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.form.dao.implementation.mongodb.UserDAOImpMongoDB;
import com.form.model.beans.User;

/**
 * Servlet implementation class Controller
 * Controls where to redirect when user sends Http requests.
 * 
 * This class extends HttpServlet and all Http method request
 * are caught here and redirected to respected fuctions (like create, update, delete)
 * Ex: deletestudent form-doPost  redirect to  
 * User DAO implementation deleteStudent()
 * 
 * methods: Two
 * 
 * 		doGet
 * 		doPost
 * 
 * @author visweshwaran
 *  
 * 
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	
		System.out.println("doPost method executed");
		
		try{
			
			if(request.getParameter("register")!= null){
			
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				User user = new User();
				
			}
			
			
			
		}
		catch(Exception e){
			
			
		}
		
	
	
	
	
	
	
	}

}
