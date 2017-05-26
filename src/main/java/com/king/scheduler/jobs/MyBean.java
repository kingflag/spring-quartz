/**
 * File Name：MyBean.java
 *
 * Copyright Defonds Corporation 2015 
 * All Rights Reserved
 *
 */
package com.king.scheduler.jobs;

import org.springframework.stereotype.Component;

/**
 * 
 * Project Name：spring-quartz
 * Type Name：MyBean
 * Type Description：
 * Author：king
 * Create Date：2017-05-26
 * @version 
 * 
 */
@Component("myBean")
public class MyBean {
 
    public void printMessage() {
        System.out.println("I am MyBean. I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
    }
     
}
