package com.vteba.user.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vteba.user.dao.spi.UserDao;
import com.vteba.user.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory jta1SessionFactory;
	
	public Long save(User user) {
		return (Long) jta1SessionFactory.getCurrentSession().save(user);
	}

}
