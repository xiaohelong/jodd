// Copyright (c) 2003-2014, Jodd Team (jodd.org). All Rights Reserved.

package jodd.log.impl;

import jodd.log.Logger;

/**
 * SLF4J logger adapter.
 */
public class Slf4jLogger implements Logger {

	private final org.slf4j.Logger logger;

	public Slf4jLogger(org.slf4j.Logger logger) {
		this.logger = logger;
	}

	public String getName() {
		return logger.getName();
	}

	public boolean isEnabled(Level level) {
		switch (level) {
			case TRACE: return logger.isTraceEnabled();
			case DEBUG: return logger.isDebugEnabled();
			case INFO: return logger.isInfoEnabled();
			case WARN: return logger.isWarnEnabled();
			case ERROR: return logger.isErrorEnabled();
			default:
				throw new IllegalArgumentException();
		}
	}

	public void log(Level level, String message) {
		switch (level) {
			case TRACE: logger.trace(message); return;
			case DEBUG: logger.debug(message); return;
			case INFO: logger.info(message); return;
			case WARN: logger.warn(message); return;
			case ERROR: logger.error(message); return;
		}
	}

	public boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	public void trace(String message) {
		logger.trace(message);
	}

	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	public void debug(String message) {
		logger.debug(message);
	}

	public boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	public void info(String message) {
		logger.info(message);
	}

	public boolean isWarnEnabled() {
		return logger.isWarnEnabled();
	}

	public void warn(String message) {
		logger.warn(message);
	}

	public void warn(String message, Throwable throwable) {
		logger.warn(message, throwable);
	}

	public boolean isErrorEnabled() {
		return logger.isErrorEnabled();
	}

	public void error(String message) {
		logger.error(message);
	}

	public void error(String message, Throwable throwable) {
		logger.error(message, throwable);
	}
}