package com.hnhy99999.mybatis.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mybatis")
public class AppMessageContoller {
	
	@Autowired
	private AppMessageService appMessageService;
	
	
	@RequestMapping("/getMessage")
	public List<AppMessage> getMessage(){
		List<AppMessage> list = appMessageService.getMessage();
		return list;
	}
	
}
