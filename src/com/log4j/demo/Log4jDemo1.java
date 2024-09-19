package com.log4j.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jDemo1 {
	public static void main(String[] args) {
		PropertyConfigurator.configure("G:\\SpringByDeepak\\Log4jProject-4-FileAppender-2\\src\\com\\log4j\\resources\\log4j.properties");
		
		System.out.println("-----------App Starts------------");
		Logger logger = Logger.getLogger("Log4jDemo1");
		logger.fatal("This is a fatel message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is a trace message");
		System.out.println("-----------App Starts------------");
	
	}
}
