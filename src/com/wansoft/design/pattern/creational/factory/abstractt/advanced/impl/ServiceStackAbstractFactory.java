package com.wansoft.design.pattern.creational.factory.abstractt.advanced.impl;

import java.util.Properties;

import com.wansoft.design.pattern.utils.PropertiesUtil;

public class ServiceStackAbstractFactory {
	
	public ServiceStackAbstractFactory(){}
	
	public static IServiceStackAbstractFactory createServiceFactory() {
		Properties props = PropertiesUtil.loadProperty(
				"META-INF/AbstractFactoryConfiguration.properties");
		String factoryClass = 
				props.getProperty("serviceProductImplClass");
		try {
			return (IServiceStackAbstractFactory)
					Class.forName(factoryClass).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
