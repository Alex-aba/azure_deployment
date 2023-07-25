package com.aba.azure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import java.util.Properties;

@Configuration
public class FreeMarkerConfig {

    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer() {
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setTemplateLoaderPath("/");
        freeMarkerConfigurer.setDefaultEncoding("UTF-8");

        Properties freeMarkerProperties = new Properties();
        freeMarkerProperties.setProperty("template_update_delay", "0");
        freeMarkerProperties.setProperty("whitespace_stripping", "true");
        freeMarkerProperties.setProperty("default_encoding", "UTF-8");
        freeMarkerProperties.setProperty("locale", "UTF-8");
        freeMarkerProperties.setProperty("url_escaping_charset", "UTF-8");
        freeMarkerProperties.setProperty("locale", "UTF-8");
        freeMarkerProperties.setProperty("number_format", "0.##########");
        freeMarkerProperties.setProperty("datetime_format", "yyyy-MM-dd HH:mm:ss");
        freeMarkerProperties.setProperty("classic_compatible", "true");

        freeMarkerConfigurer.setFreemarkerSettings(freeMarkerProperties);
        return freeMarkerConfigurer;
    }

    @Bean
    public FreeMarkerViewResolver freeMarkerViewResolver() {
        FreeMarkerViewResolver freeMarkerViewResolver = new FreeMarkerViewResolver();
        freeMarkerViewResolver.setPrefix("/web/view/");
        freeMarkerViewResolver.setSuffix(".html");
        freeMarkerViewResolver.setContentType("text/html;charset=UTF-8");
        freeMarkerViewResolver.setCache(true);
        freeMarkerViewResolver.setOrder(0);

        return freeMarkerViewResolver;
    }


}
