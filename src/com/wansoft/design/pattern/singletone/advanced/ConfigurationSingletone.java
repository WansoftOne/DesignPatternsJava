package com.wansoft.design.pattern.singletone.advanced;

import java.util.Properties;

import com.wansoft.design.pattern.utils.PropertiesUtil;

public class ConfigurationSingletone {
	
	private static ConfigurationSingletone singletone;
	
	private static final String CONFIGURATION_PROP = "META-INF/Configuration.properties";
	
	private static final String APP_NAME_PROP = "appName";
	private static final String APP_VERSION_PROP = "appVersion";
	
	private String appName;
	private String appVersion;
	
	private ConfigurationSingletone() {
		Properties prop = PropertiesUtil.loadProperty(CONFIGURATION_PROP);
		this.appName = prop.getProperty(APP_NAME_PROP);
		this.appVersion = prop.getProperty(APP_VERSION_PROP);
	}
	
	private static synchronized void createInstance() {
		if(singletone == null) {
			singletone = new ConfigurationSingletone();
		}
	}
	
	public static ConfigurationSingletone getInstance() {
		if(singletone == null) {
			createInstance();
		}
		return singletone;
	}
	
	/**
	 * Getters and Setters
	 */
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	
}