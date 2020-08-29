package com.hnhy99999.mybatis.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppMessageServiceImpl implements AppMessageService {

	@Autowired
	private AppMessageDao appMessageDao;
	
	@Override
	public List<AppMessage> getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AppMessage> ageAllMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addMessage(AppMessage appMessage) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AppMessage> getMessageById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delMessage(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
