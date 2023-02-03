package com.in28minutes.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix="currency-service")
public class CurrencyServiceConfiguration {
	private String url;
	private String username;
	private String key;
	
	public CurrencyServiceConfiguration(String url, String username, String key) {
		super();
		this.url = url;
		this.username = username;
		this.key = key;
	}
	
	@Override
	public String toString() {
		return "CurrencyServiceConfiguration [url=" + url + ", username=" + username + ", key=" + key + "]";
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	
}
