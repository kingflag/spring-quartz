/**
 * File Name：AppMain.java
 *
 * Copyright Defonds Corporation 2015 
 * All Rights Reserved
 *
 */
package com.king.scheduler;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * Project Name：spring-quartz
 * Type Name：AppMain
 * Type Description：
 * Author：King
 * Create Date：2017-05-26
 * @version 
 * 
 */
public class AppMain {

	@SuppressWarnings("resource")
	public static void main(String args[]){
        @SuppressWarnings("unused")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("quartz-context.xml");
    }

}
