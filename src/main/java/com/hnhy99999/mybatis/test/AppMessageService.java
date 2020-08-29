package com.hnhy99999.mybatis.test;

import java.util.List;

public interface AppMessageService {
	
	public List<AppMessage> getMessage();
	
	public List<AppMessage> ageAllMessage();
	
	public int addMessage(AppMessage appMessage);
	
	public List<AppMessage> getMessageById(String id);
	
	public int delMessage(String id);
}
