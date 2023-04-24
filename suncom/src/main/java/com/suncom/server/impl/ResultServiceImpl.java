package com.suncom.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suncom.dao.ResultDao;
import com.suncom.entity.UserResult;
import com.suncom.server.ResultService;

@Service
public class ResultServiceImpl implements ResultService {

	@Autowired
	ResultDao resultDao;

	@Override
	public UserResult queryById(int questionid) {

		return resultDao.queryById(questionid);
	}

	@Override
	public int addUser(UserResult userResult) {

		int raFlag = resultDao.addUser(userResult);
		return raFlag;
	}

	@Override
	public int dropUser(int questionid) {

		int rdFlag = resultDao.dropUser(questionid);
		return rdFlag;
	}

	@Override
	public int modifyUser(UserResult userResult) {

		int rmFlag = resultDao.modifyUser(userResult);
		return rmFlag;
	}

	@Override
	public List<UserResult> queryAllUser() {

		return resultDao.queryAllUser();
	}

}
