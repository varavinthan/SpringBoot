package com.example.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoginServices implements Login, Newuser {
	
	private static final Log log = LogFactory.getLog(LoginServices.class);
    
	/* (non-Javadoc)
	 * @see com.example.services.Login#login(java.lang.String, java.lang.String)
	 */
	@Override
	public void login(String username, String password)
	{
		log.info("login username is " + username);
		log.info("login password is "+ password);
	}
	
	/* (non-Javadoc)
	 * @see com.example.services.Newuser#createaccount(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void createaccount(String firstname,String Lastname, String username, String password)
	{
		log.info("Firstname entered is" +firstname);
		log.info("Last name entered is" +Lastname);
		log.info("username selected is" +username);
		log.info("password selected is" +password);
	}
}
