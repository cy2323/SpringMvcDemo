package com.test.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.test.dao.UserDao;
import com.test.entity.UserEntity;
import com.test.util.MyBatisUtil;


@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public List<UserEntity> queryUserInfo(String uName, String uPassword) {
		
		SqlSession session = MyBatisUtil.getSession();
		
		try {
            //通过MyBatis实现接口BookTypeDAO，返回实例
			UserDao userDao =  session.getMapper(UserDao.class);
			
			List<UserEntity> userList = userDao.queryUserInfo(uName, uPassword);
			
            return userList;
        } finally {
            session.close();
        }
	}

}
