package com.proxibanque.ProxiBanqueSI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;


@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"controller"} )
public class ProxyBanquetSiApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProxyBanquetSiApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ProxyBanquetSiApplication.class, args);
	}

	@RequestMapping({"/test"})
	String test (){
		return "test";
	}
}
