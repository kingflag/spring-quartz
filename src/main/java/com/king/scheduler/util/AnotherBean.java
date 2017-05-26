/**
 * File Name：AnotherBean.java
 *
 * Copyright Defonds Corporation 2015 
 * All Rights Reserved
 *
 */
package com.king.scheduler.util;

import org.springframework.stereotype.Component;

/**
 * 
 * Project Name：spring-quartz
 * Type Name：AnotherBean
 * Type Description：
 * Author：king
 * Create Date：2017-05-26
 * @version 
 * 
 */
@Component("anotherBean")
public class AnotherBean {
     
    public void printAnotherMessage(){
        System.out.println("I am AnotherBean. I am called by Quartz jobBean using CronTriggerFactoryBean");
    }
     
}
