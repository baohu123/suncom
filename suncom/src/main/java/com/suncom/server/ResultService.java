package com.suncom.server;

import java.util.List;

import org.springframework.stereotype.Service;

import com.suncom.entity.UserResult;

@Service
public interface ResultService {

	UserResult queryById(int questionid);

	int addUser(UserResult userResult);

	int dropUser(int questionid);

	int modifyUser(UserResult userResult);

	List<UserResult> queryAllUser();
}
