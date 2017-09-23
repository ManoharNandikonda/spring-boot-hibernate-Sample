/**
 * 
 */
package com.mano.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mano.dao.UserDao;
import com.mano.model.UserDetails;
import com.mano.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public List<UserDetails> getUserDetails() {
		return userDao.getUserDetails();

	}

}
