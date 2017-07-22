package com.wallee.mobile.backend;

public class Configuration {

	private final static Configuration INSTANCE = new Configuration();

	private Configuration() {
//		SystemProperty
	}
	
	public long getApiUserId() {
		return 0;
	}
	
	public String getApiKey() {
		return null;
	}
	
}
