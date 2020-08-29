package com.hnhy99999.zhgd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hnhy99999.zhgd.mapper.DustMonitoring;
import com.hnhy99999.zhgd.mapper.DustWarning;

@Mapper
public interface DustMonitoringDao {
	
	//查询所有信息
	public DustMonitoring getDustMonitorings(int id);
	//查询所有信息
		public List<DustMonitoring> getDustMonitorings();
	
	/**
	 * 添加一条扬尘数据
	 * @param dust
	 * @return
	 */
	public int addDustMon(DustMonitoring dust);
	
	/**
	 * 添加一条报警信息
	 * @param dustW
	 * @return
	 */
	public boolean addWarning(DustWarning dustW);
	
	/**
	 * 查询所有的报警
	 * @return
	 */
	public List<DustWarning> getAddWarningList();
	
	/**
	 * 根据id进行查询报警详情
	 * @param id 4
	 * @return
	 */
	public DustWarning getAddWarning(int id);
	
}
