package com.spring.boot.mini.jsp;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.spring.boot.mini.jsp.model.Mobile;

@Configuration
public class AppConfig {
	
	@Autowired
	public DbConfiguration config;
	
	public LocalSessionFactoryBean getSessionFactoryBean(){
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		Properties props = new Properties();
		props.put("DRIVER", config.getDriver());
		props.put("URL", config.getUrl());
		props.put("USER", config.getUser());
		props.put("PASSWORD", config.getPassword());
		sessionFactory.setHibernateProperties(props);
		sessionFactory.setAnnotatedClasses(Mobile.class);
		
		return sessionFactory;
	}

}
