package com.suncom.server;

import java.util.List;

import org.springframework.stereotype.Service;

import com.suncom.entity.UserAdmin;

@Service
public interface AdminService {

	// ユーザーで検索
	UserAdmin findByUsername(int pkid);

	// ログイン方法
	UserAdmin loginIn(String userid, String password);

	// すべてのユーザーを照会する
	List<UserAdmin> queryAllUser();

}
