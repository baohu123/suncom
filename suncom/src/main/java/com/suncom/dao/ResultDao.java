package com.suncom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.suncom.entity.UserResult;

@Mapper
public interface ResultDao {

	UserResult queryById(int questionid);

	int addUser(UserResult userResult);

	int dropUser(int questionid);

	int modifyUser(UserResult userResult);

	List<UserResult> queryAllUser();

}
