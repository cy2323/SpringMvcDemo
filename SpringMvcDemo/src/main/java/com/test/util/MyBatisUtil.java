package com.test.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	private static SqlSessionFactory factory = null;

	public static SqlSessionFactory getSqlSessionFactory() {
		
		if (factory == null) {
			// get configuration of mybatis
			InputStream config = MyBatisUtil.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
			// cerate sql session factory
			factory = new SqlSessionFactoryBuilder().build(config);
		}
		return factory;
	}

	// get session
	public static SqlSession getSession() {
		return getSqlSessionFactory().openSession(true);
	}

	public static SqlSession getSession(boolean isAutoCommit) {
		return getSqlSessionFactory().openSession(isAutoCommit);
	}
}
