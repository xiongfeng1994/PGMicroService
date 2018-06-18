package com.ebest.cloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.ebest.cloud.interceptor.MonitorInterceptor;
/**
 * webmvc configuration
 * @author ebest
 *
 */
@Configuration
public class SpringBootMvcConfigurer extends WebMvcConfigurerAdapter {
	
	/**
	 * add interceptor
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(new MonitorInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}
	
	/**
	 * add resource handlers
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		// call static swagger resources
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

	}
}
