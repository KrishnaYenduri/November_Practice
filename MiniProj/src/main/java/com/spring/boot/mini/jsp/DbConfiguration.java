package com.spring.boot.mini.jsp;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("classpath:hibernate.properties")
public class DbConfiguration {
	
	private String driver;
	
	private String url;
	
	private String user;
	
	private String password;

	public DbConfiguration() {
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
