package com.suncom.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suncom.dao.QuestionDao;
import com.suncom.entity.UserQuestion;
import com.suncom.server.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionDao questrionDao;

	@Override
	public UserQuestion queryById(int questionid) {

		return questrionDao.queryById(questionid);
	}

	@Override
	public int addUser(UserQuestion userQuestion) {

		int aFlag = questrionDao.addUser(userQuestion);
		return aFlag;
	}

	@Override
	public int dropUser(int questionid) {
		int dFlag = questrionDao.dropUser(questionid);
		return dFlag;
	}

	@Override
	public int modifyUser(UserQuestion userQuestion) {
		int mFlag = questrionDao.modifyUser(userQuestion);
		return mFlag;
	}

	@Override
	public List<UserQuestion> queryAllUser() {

		return questrionDao.queryAllUser();
	}

}
