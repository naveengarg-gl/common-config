package com.training.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigCommonApplication.class, args);
	}

}
