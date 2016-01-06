/**
 * 
 */
package main.java.services;

import main.java.dao.ISpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hemal.prajapati
 *
 */
@Component
public class SpringDemoService implements ISpringDemoService {

	
	@Autowired(required = true)
	ISpringDemo dao;
	
	/* (non-Javadoc)
	 * @see main.java.services.ISpringDemoService#springDemoMessage()
	 */
	@Override
	public void updateUserInfo() {
		dao.updateUserInfo();
	}

	@Override
	public void getUserInfo() {
		 dao.getUserInfo();
	}

	@Override
	public void getUserList() {
		dao.getUserList();
	}

}
