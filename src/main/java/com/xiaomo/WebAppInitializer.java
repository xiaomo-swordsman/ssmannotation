package com.xiaomo;

import com.xiaomo.config.SpringConfiguration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInitializer implements WebApplicationInitializer {


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
//      <context-param>
//        <param-name>contextConfigLocation</param-name>
//        <param-value>classpath:applicationContext.xml</param-value>
//      </context-param>
        // 创建ApplicationContext
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(SpringConfiguration.class);

//    <servlet>
//        <servlet-name>springMVC</servlet-name>
//        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//        <init-param>
//          <param-name>contextConfigLocation</param-name>
//          <param-value>classpath:spring-mvc.xml</param-value>
//        </init-param>
//        <load-on-startup>1</load-on-startup>
//    </servlet>
//    <servlet-mapping>
//        <servlet-name>springMVC</servlet-name>
//        <url-pattern>/</url-pattern>
//    </servlet-mapping>
        // 注册DispatcherServlet
        // 因为我们在SpringMvcConfiguration配置了@EnableWebMvc，所以在上面的一步，加载AnnotationConfigWebApplicationContext 时候会自动装配了SpringMvcConfiguration的配置
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(applicationContext));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
