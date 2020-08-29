package com.hnhy99999.quartz.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestTask {

	 private static final Logger log = LoggerFactory.getLogger(TestTask.class);
	 public void run() {
		 if (log.isInfoEnabled()) {
			log.info("线程开始执行");
		}
		 System.out.println("query run .....");
	 }
}
