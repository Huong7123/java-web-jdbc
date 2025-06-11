package com.quanghuong.service.impl;

import javax.inject.Inject;

import com.quanghuong.dao.IUserDAO;
import com.quanghuong.model.UserModel;
import com.quanghuong.service.IUserService;

public class UserService implements IUserService{

	@Inject
	private IUserDAO userDAO;
	
	
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
	}
	

}
