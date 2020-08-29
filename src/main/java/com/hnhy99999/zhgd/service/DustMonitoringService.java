package com.hnhy99999.zhgd.service;

import java.util.List;

import com.hnhy99999.zhgd.mapper.DustMonitoring;
import com.hnhy99999.zhgd.mapper.DustWarning;

public interface DustMonitoringService {
	
	//查询所有信息
	public List<DustMonitoring> getDustMonitorings();
	
	//添加一条数据
	public int addDustMon(DustMonitoring dust);
	//添加一条报警信息
	public boolean addDustWaring(DustWarning dustW);
}
