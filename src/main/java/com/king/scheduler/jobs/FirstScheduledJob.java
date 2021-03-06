/**
 * File Name：ScheduledJob.java
 *
 * Copyright Defonds Corporation 2015 
 * All Rights Reserved
 *
 */
package com.king.scheduler.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.king.scheduler.util.AnotherBean;

/**
 * 
 * Project Name：spring-quartz
 * Type Name：ScheduledJob
 * Type Description：
 * Author：king
 * Create Date：2017-05-26
 * @version 
 * 
 */
public class FirstScheduledJob extends QuartzJobBean {
	
	private AnotherBean anotherBean;

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		System.out.println("I am FirstScheduledJob");
		this.anotherBean.printAnotherMessage();

	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}
}
