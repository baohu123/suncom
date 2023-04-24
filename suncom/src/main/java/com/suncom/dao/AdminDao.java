package com.suncom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.suncom.entity.UserAdmin;

@Mapper
public interface AdminDao {

	// ユーザーで検索
	UserAdmin findByUsername(int pkid);

	UserAdmin loginIn(String userid, String password);

	// すべてのユーザーを照会する
	List<UserAdmin> queryAllUser();

}
