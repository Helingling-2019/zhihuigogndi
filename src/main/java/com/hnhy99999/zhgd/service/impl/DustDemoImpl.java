package com.hnhy99999.zhgd.service.impl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hnhy99999.zhgd.dao.DustMonitoringDao;
import com.hnhy99999.zhgd.mapper.DustMonitoring;
import com.hnhy99999.zhgd.service.DustDemo;

@Component
public class DustDemoImpl implements DustDemo{
	@Autowired
	private DustMonitoringDao dustMonitoringDao;

	@Override
	public DustMonitoring getDustMonitorings(int id) {
		return dustMonitoringDao.getDustMonitorings(id);
	}

	@Override
	public String List() {
		// TODO Auto-generated method stub
		return null;
	}


}
