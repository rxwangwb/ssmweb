package com.ssmweb.pojo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class LogBackTestListener implements ServletContextListener {
    private static final Logger logger = LogManager.getLogger(LogBackTestListener.class);
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.debug("logback监听器启动...");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.debug("logback监听器启动...");
    }
}
