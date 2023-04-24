package com.suncom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.suncom.entity.UserQuestion;

@Mapper
public interface QuestionDao {

	UserQuestion queryById(int questionid);

	int addUser(UserQuestion userQuestion);

	int dropUser(int questionid);

	int modifyUser(UserQuestion userQuestion);

	List<UserQuestion> queryAllUser();

}
