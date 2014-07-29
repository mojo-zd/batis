package org.batis.config;

import org.batis.resource.PetsResource;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置文件
 * @author joshua
 * @date 2014-7-29
 * @version
 */
@Configuration
public class BatisConfig {

	/**
	 * 返回json(注:bean的名字是根据方法名生成的)
	 * @return
	 */
	@Bean
	public JacksonJsonProvider jacksonJsonProvider() {
		return new JacksonJsonProvider();
	}
	
	/**
	 * 宠物API
	 * @return
	 */
	@Bean
	public PetsResource petsResource() {
		return new PetsResource();
	}
}
