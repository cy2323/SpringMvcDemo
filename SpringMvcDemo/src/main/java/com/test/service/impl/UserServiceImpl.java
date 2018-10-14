package com.test.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDao;
import com.test.entity.UserEntity;
import com.test.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<UserEntity> queryUserInfo(String uName, String uPassword) {

		logger.info("Service is success!");
		return userDao.queryUserInfo(uName, uPassword);
	}

}
