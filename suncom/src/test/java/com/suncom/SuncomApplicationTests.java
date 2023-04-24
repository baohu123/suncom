package com.suncom;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import com.suncom.entity.UserResult;
import com.suncom.server.AdminService;
import com.suncom.server.QuestionService;
import com.suncom.server.ResultService;

@RunWith(SpringRunner.class)
@SpringBootTest
class SuncomApplicationTests {
	
	@Autowired
	AdminService adminService;

	@Test
	public void loginIn() {
		System.out.println(adminService.loginIn("admin@gmail.com", "admin"));
	}

}
