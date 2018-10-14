package com.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.test.entity.UserEntity;

public interface UserDao {

	List<UserEntity> queryUserInfo(@Param("uName") String uName, @Param("uPassword") String uPassword);
}
