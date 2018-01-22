package com.example.demo;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;



@SpringBootApplication

public class SpringBootWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootWebApplication.class);
	}

	public static void main(String[] args) throws Exception {

		
		ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(SpringBootWebApplication.class)
				.properties("spring.config.name:application,conf",
						"spring.config.location:classpath:/External,classpath:/")
				.build().run(args);
 
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
 
		System.out.println(environment.getProperty("app.firstname"));
		System.out.println(environment.getProperty("conf.lastname"));
		
		
		
		
		
		
		
		
		//SpringApplication.run(SpringBootWebApplication.class, args);
		//SpringApplicationBuilder springApplicationBuilder = (SpringApplicationBuilder) new SpringApplicationBuilder(
				//SpringBootWebApplication.class).sources(SpringBootWebApplication.class).properties(getProperties())
					//	.run(args);
		//SpringApplication.run(SpringBootWebApplication.class, args);
	}

	static Properties getProperties() {
		Properties props = new Properties();
		props.put("spring.config.location", "D:/Sachin/application.properties");
		return props;
	}
}
