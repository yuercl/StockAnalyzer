package com.yuer.stockanalyzer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	private static Logger logger = LoggerFactory.getLogger(Application.class);

	public static ApplicationContext context;// Spring的上下文，里面保存有初始化的bean,Service也在里面

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("/config/applicationContext.xml");

	}

}
