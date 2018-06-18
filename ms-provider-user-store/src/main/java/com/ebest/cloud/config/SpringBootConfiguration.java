package com.ebest.cloud.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * spring boot configuration class
 * 
 * @author ebest
 *
 */
@Configuration
public class SpringBootConfiguration {

	/**
	 * Reference fastjson as a json conversion tool
	 * 
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		
		// fastJsonConfig.setSerializerFeatures
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		
		// handling Chinese garbled
		List<MediaType> fastMedisTypes = new ArrayList<MediaType>();
		fastMedisTypes.add(MediaType.APPLICATION_JSON_UTF8);
		
		// the object that defines a convert message
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		fastConverter.setSupportedMediaTypes(fastMedisTypes);
		fastConverter.setFastJsonConfig(fastJsonConfig);
		
		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}
	
	/**
	 * valid parameter bean configuration
	 * @return
	 */
	@Bean
    public MethodValidationPostProcessor methodValidationPostProcessor(){
		return new MethodValidationPostProcessor();
    }

}
