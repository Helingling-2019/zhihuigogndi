package com.hnhy99999.zhgd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hnhy99999.zhgd.dao.DustMonitoringDao;
import com.hnhy99999.zhgd.mapper.DustMonitoring;
import com.hnhy99999.zhgd.mapper.DustWarning;
import com.hnhy99999.zhgd.service.DustMonitoringService;

@Component
public class DustMonitoringServiceImpl implements DustMonitoringService{

	@Autowired
	private DustMonitoringDao dustMonitoringDao;
	
	@Override
	public List<DustMonitoring> getDustMonitorings() {
		// TODO Auto-generated method stub
		return dustMonitoringDao.getDustMonitorings();
	}


	@Override
	public int addDustMon(DustMonitoring dust) {
		// TODO Auto-generated method stub
		
		return dustMonitoringDao.addDustMon(dust);
	}


	@Override
	public boolean addDustWaring(DustWarning dustW) {
		// TODO Auto-generated method stub
		if (dustMonitoringDao.addWarning(dustW)) {
			return true;
		}
		return false;
	}

}
