package com.test.util;

import org.slf4j.LoggerFactory;

public class Logger {
	private final org.slf4j.Logger logger;

	private Logger(Class<?> clazz) {
		logger = LoggerFactory.getLogger(clazz);
	}

	private Logger(String className) {
		logger = LoggerFactory.getLogger(className);
	}

	public static Logger getLogger(Class<?> clazz) {
		return new Logger(clazz);
	}

	public static Logger getLogger(String className) {
		return new Logger(className);
	}

	public void debug(String message) {
		if (logger.isDebugEnabled()) {
			logger.debug(message);
		}
	}

	public void debug(String message, Throwable t) {
		if (logger.isDebugEnabled()) {
			logger.debug(message, t);
		}
	}

	public void info(String message) {
		if (logger.isInfoEnabled()) {
			logger.info(message);
		}
		if (logger.isDebugEnabled()) {
			logger.debug(message);
		}
	}

	public void info(String message, Throwable t) {
		if (logger.isInfoEnabled()) {
			logger.info(message, t);
		}
		if (logger.isDebugEnabled()) {
			logger.debug(message, t);
		}
	}

	public void warn(String message) {
		if (logger.isWarnEnabled()) {
			logger.warn(message);
		}
		if (logger.isDebugEnabled()) {
			logger.debug(message);
		}
	}

	public void warn(String message, Throwable t) {
		if (logger.isWarnEnabled()) {
			logger.warn(message, t);
		}
		if (logger.isDebugEnabled()) {
			logger.debug(message, t);
		}
	}

	public void error(String message) {
		if (logger.isErrorEnabled()) {
			logger.error(message);
		}
		if (logger.isDebugEnabled()) {
			logger.debug(message);
		}
	}

	public void error(String message, Throwable t) {
		if (logger.isErrorEnabled()) {
			logger.error(message, t);
		}
		if (logger.isDebugEnabled()) {
			logger.debug(message, t);
		}
	}
}
