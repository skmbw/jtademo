package com.vteba.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vteba.user.dao.spi.UserDao;
import com.vteba.user.model.User;
import com.vteba.user.service.spi.UserService;

@Service
@Transactional(value = "xaTransactionManager")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDaoImpl;
	
	public Long save(User user) {
		return userDaoImpl.save(user);
	}
}
