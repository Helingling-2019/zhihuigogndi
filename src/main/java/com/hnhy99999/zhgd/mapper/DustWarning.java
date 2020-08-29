package com.hnhy99999.zhgd.mapper;

import java.util.Date;

public class DustWarning {
	//id 自增
	public int id;
	//报警名称
	public String name;
	//报警值
	public double value;
	//报警内容
	public String content;
	//报警时间
	public Date ctime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	 
}
