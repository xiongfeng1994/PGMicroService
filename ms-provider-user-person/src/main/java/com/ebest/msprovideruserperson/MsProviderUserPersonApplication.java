package com.ebest.msprovideruserperson;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan(basePackages = {"com.ebest.cloud"})
@MapperScan(basePackages= {"com.ebest.cloud.mapper"})
@SpringBootApplication(scanBasePackages= {"com.ebest.cloud"})
public class MsProviderUserPersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProviderUserPersonApplication.class, args);
	}
}
