package com.suncom.server;

import java.util.List;

import org.springframework.stereotype.Service;

import com.suncom.entity.UserQuestion;

@Service
public interface QuestionService {

	UserQuestion queryById(int questionid);

	int addUser(UserQuestion userQuestion);

	int dropUser(int questionid);

	int modifyUser(UserQuestion userQuestion);

	List<UserQuestion> queryAllUser();
}
