package com.gbss.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GbssCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GbssCloudConfigServerApplication.class, args);
	}

}
