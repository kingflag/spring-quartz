/**
 * File Name：SecondScheduledJob.java
 *
 * Copyright Defonds Corporation 2015 
 * All Rights Reserved
 *
 */
package com.king.scheduler.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 
 * Project Name：spring-quartz
 * Type Name：SecondScheduledJob
 * Type Description：
 * Author：king
 * Create Date：2017-05-26
 * @version 
 * 
 */
public class SecondScheduledJob extends QuartzJobBean {

	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		System.out.println("I am SecondScheduledJob");

	}

}
