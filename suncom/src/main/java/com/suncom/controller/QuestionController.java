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
import org.springframework.web.servlet.ModelAndView;

import com.suncom.entity.UserQuestion;
import com.suncom.server.QuestionService;

@Controller
public class QuestionController {

	@Autowired
	QuestionService questionService;

	// queryAll
	@RequestMapping("/userQuestion")
	public String showUsers(ModelMap modelMap) {
		List<UserQuestion> userQuestion = questionService.queryAllUser();
		modelMap.addAttribute("userQuestion", userQuestion);
		return "userQuestion";
	}

	@RequestMapping("query")

	@ResponseBody
	public UserQuestion query(Integer QuestionID) {
		return questionService.queryById(QuestionID);
	}

	// delete
	@RequestMapping(value = "/deleteUserQuestion+{id}")
	public String dropUser(@PathVariable("id") Integer id, ModelMap modelMap) {
		int flag = questionService.dropUser(id);
		List<UserQuestion> userQuestion = questionService.queryAllUser();
		modelMap.addAttribute("userQuestion", userQuestion);
		if (flag == 1) {
			return "userQuestion";
		} else {
			return "error";
		}
	}

	// queryById
	@RequestMapping("/userQuestionUpdate+{id}")
	public String queryUser(@PathVariable("id") Integer id, ModelMap modelMap) {
		UserQuestion userQuestion = questionService.queryById(id);
		modelMap.addAttribute("userQuestion", userQuestion);
		return "userQuestionUpdate";
	}

	// queryById
	@RequestMapping("/userQuestionAdd+{id}")
	public String queryUserQuestionAdd(@PathVariable("id") Integer id, ModelMap modelMap) {
		UserQuestion userQuestion = questionService.queryById(id);
		modelMap.addAttribute("userQuestion", userQuestion);
		return "userQuestionAddPage";
	}

	// add
	@RequestMapping("/addUserQuestion")
	@ResponseBody
	public Map addUser(UserQuestion userQuestion) {
		int flag = questionService.addUser(userQuestion);
		Map<String, Object> map = new HashMap<String, Object>();
		if (flag == 1) {
			map.put("msg", "新規出来だ");
			return map;
		} else {
			map.put("msg", "新規失敗した");
			return map;
		}
	}

	// update
	@RequestMapping("/modifyUserQuestion")
	@ResponseBody
	public Map modifyUser(UserQuestion userQuestion) {
		int flag = questionService.modifyUser(userQuestion);
		Map<String, Object> map = new HashMap<>();
		if (flag == 1) {
			map.put("msg", "編集出来た");
			return map;
		} else {
			map.put("msg", "編集失敗した");
			return map;
		}
	}

}
