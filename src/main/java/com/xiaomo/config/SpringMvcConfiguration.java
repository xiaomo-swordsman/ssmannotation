package com.xiaomo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.ArrayList;
import java.util.List;

import static com.alibaba.druid.sql.dialect.mysql.ast.clause.MySqlFormatName.JSON;

@Configuration
@ComponentScan("com.xiaomo.controller") // <context:component-scan base-package="com.xiaomo.controller"></context:component-scan>
@EnableWebMvc
public class SpringMvcConfiguration implements WebMvcConfigurer {


//    <!-- 视图解析器 -->
//    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
//        <property name="prefix" value="/"></property>
//        <property name="suffix" value=".jsp"></property>
//    </bean>
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;

    }

    @Override
    public void configureDefaultServletHandling(org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addResourceHandlers(org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }

    @Override
    public void addViewControllers(org.springframework.web.servlet.config.annotation.ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }

    @Override
    public void configureMessageConverters(java.util.List<org.springframework.http.converter.HttpMessageConverter<?>> converters) {
//        FastJsonHttpMessageConverter messageConverter = new FastJsonHttpMessageConverter();
//        List<MediaType> mediaTypes = new ArrayList<MediaType>();
//        mediaTypes.add(MediaType.TEXT_HTMLHTML) ;
//        mediaTypes.add(MediaType.TEXT_PLAIN);
//        mediaTypes.add(MediaType.APPLICATION_JSON);
//        messageConverter.setSupportedMediaTypes(mediaTypes);
//        messageConverter.setDateFormat("yyyy-MM-dd HH:mm:ss");
//        converters.add(messageConverter);
    }


}
