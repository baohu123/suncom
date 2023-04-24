package com.suncom.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.suncom.entity.UserQuestion;
import com.suncom.entity.UserResult;
import com.suncom.server.QuestionService;
import com.suncom.server.ResultService;

@Controller
public class ResultController {

	@Autowired
	ResultService resultService;

	// queryAll
	@RequestMapping("/user")
	public String showUsers(ModelMap modelMap) {
		List<UserResult> resultList = resultService.queryAllUser();
		modelMap.addAttribute("resultList", resultList);
		return "user";
	}

	// add
	@RequestMapping("/addUserResult")
	@ResponseBody
	public Map addUser(UserResult userResult) {
		int flag = resultService.addUser(userResult);
		Map<String, Object> map = new HashMap<String, Object>();
		if (flag == 1) {
			map.put("msg", "回答感謝します。!");
			return map;
		} else {
			map.put("msg", "新規失敗した");
			return map;
		}
	}

	/*
	 * //add
	 * 
	 * @RequestMapping("/addUser")
	 * 
	 * @ResponseBody public Map addUser(UserQuestion userBean){ int flag =
	 * questionService.addUser(userBean); Map<String,Object> map = new
	 * HashMap<String,Object>(); if(flag == 1){ //map.put("msg","新規出来だ"); return
	 * map; }else { //map.put("msg","新規失敗した"); return map; } }
	 */

}
