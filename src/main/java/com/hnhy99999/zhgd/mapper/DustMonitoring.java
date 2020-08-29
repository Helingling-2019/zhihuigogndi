

package com.hnhy99999.zhgd.mapper;

public class DustMonitoring {
	private int id ;
	//设别id
	private int device_id;
	//节点
	private int node;
	//PM2.5
	private float hum;
	//PM10
	private float hum_tem;
	//pm100 = TSP
	private float hum_hundred;
	//噪音
	private float noise;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDevice_id() {
		return device_id;
	}
	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}
	public int getNode() {
		return node;
	}
	public void setNode(int node) {
		this.node = node;
	}
	
	public float getHum() {
		return hum;
	}
	public void setHum(float hum) {
		this.hum = hum;
	}
	public float getHum_tem() {
		return hum_tem;
	}
	public void setHum_tem(float hum_tem) {
		this.hum_tem = hum_tem;
	}
	public float getHum_hundred() {
		return hum_hundred;
	}
	public void setHum_hundred(float hum_hundred) {
		this.hum_hundred = hum_hundred;
	}
	public float getNoise() {
		return noise;
	}
	public void setNoise(float noise) {
		this.noise = noise;
	}
}

