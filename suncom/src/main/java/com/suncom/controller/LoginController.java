package com.suncom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.suncom.entity.UserAdmin;
import com.suncom.server.AdminService;

@Controller
public class LoginController {

	@Autowired
	AdminService adminService;

	@RequestMapping("/login")
	public String show() {

		return "login";

	}

	@RequestMapping(value = "/loginIn", method = RequestMethod.POST)
	public String loginIn(String userid, String password) {
		UserAdmin userAdmin = adminService.loginIn(userid, password);
		if (userAdmin != null) {

			System.out.println(userAdmin.getUserid());
			System.out.println(userAdmin.getPassword());

			return "success";
		} else {
			System.out.println("Userid: " + userid + ", Password: " + password);
			return "error";
		}
	}

}
