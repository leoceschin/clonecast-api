package com.clonecast.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("configs")
public class StorageProperties {

	/**
	 * Folder location for storing files
	 */
	private String location = "/static/audios";

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}


