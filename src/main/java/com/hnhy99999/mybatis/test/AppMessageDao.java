package com.hnhy99999.mybatis.test;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper 
public interface AppMessageDao {

	public List<AppMessage> getMessage();
	
	public List<AppMessage> ageAllMessage();
	
	public int addMessage(AppMessage appMessage);
	
	public List<AppMessage> getMessageById(String id);
	
	public int delMessage(String id);
}
