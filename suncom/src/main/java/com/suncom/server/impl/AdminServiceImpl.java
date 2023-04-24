package com.suncom.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suncom.dao.AdminDao;
import com.suncom.entity.UserAdmin;
import com.suncom.server.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;

	@Override
	public UserAdmin findByUsername(int pkid) {

		return adminDao.findByUsername(pkid);
	}

	@Override
	public UserAdmin loginIn(String mail, String password) {

		return adminDao.loginIn(mail, password);
	}

	@Override
	public List<UserAdmin> queryAllUser() {

		return adminDao.queryAllUser();
	}

}
