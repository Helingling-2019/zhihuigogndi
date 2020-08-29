package com.hnhy99999.zhgd.contoller;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hnhy99999.zhgd.mapper.DustMonitoring;
import com.hnhy99999.zhgd.service.DustDemo;
import com.hnhy99999.zhgd.service.DustMonitoringService;

@RestController
@RequestMapping("/dust")
public class DustMonitoringController {

	
	@Autowired 
	private DustDemo demo;

	@RequestMapping(value = {"/","/index.html"})
	public String index(){ 
		return "index";
	}
	
	@RequestMapping(value = "/monitoringdemo" ,method = RequestMethod.POST)
	 @ResponseBody
	public DustMonitoring getListDustMonitoringsdemo(){
		int id=(int)(Math.random()*2000);
		return demo.getDustMonitorings(id);
	}

	@RequestMapping(value = "/monitoringdemo1")
	 @ResponseBody
	public DustMonitoring getListDustMonitoringsdemo1(){
		int id=(int)(Math.random()*2000);
		return demo.getDustMonitorings(id);
	}

	
}
