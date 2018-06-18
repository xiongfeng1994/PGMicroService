package com.ebest.msprovideruserstore;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * springboot startup class
 * @author ebest
 *
 */
@EnableSwagger2
@EnableEurekaClient
@MapperScan(basePackages= {"com.ebest.cloud.mapper"})
@SpringBootApplication(scanBasePackages= {"com.ebest.cloud"})
public class MsProviderUserStoreApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MsProviderUserStoreApplication.class, args);
		
	}
	
}
