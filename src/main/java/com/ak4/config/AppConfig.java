package com.ak4.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class AppConfig {

    private final String DATA_SOURCE_CONFIG_FILE = "datasource.properties";
    private final String APP_CONFIG_FILE = "myapp.properties";

    @Bean
    public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        Resource dataSourceResource = new ClassPathResource(DATA_SOURCE_CONFIG_FILE);
        Resource appResource = new ClassPathResource(APP_CONFIG_FILE);
        Resource[] resources = {dataSourceResource, appResource};
        ppc.setLocations(resources);
        return ppc;
    }
}
