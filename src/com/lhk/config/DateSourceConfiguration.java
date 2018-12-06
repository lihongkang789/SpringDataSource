package com.lhk.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 * 数据源配置类-通过配置类来定义数据源
 * @author LHK
 *
 */
@Configuration
public class DateSourceConfiguration {
	
	@Bean
	public DataSource embededdataSource(){
		return new EmbeddedDatabaseBuilder()
        .setType(EmbeddedDatabaseType.H2)
        .addScript("classpath*:schema.sql")
        .addScript("classpath*:test-data.sql")
        .build();
	}
}
