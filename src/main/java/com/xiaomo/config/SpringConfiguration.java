package com.xiaomo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JdbcConfiguration.class,MyBatisConfiguration.class}) // 引入其他配置文件 <import resource="applicationContext-user.xml"/>
@ComponentScan("com.xiaomo") // 扫描包的路径 <context:component-scan base-package="com.xiaomo"></context:component-scan>
public class SpringConfiguration{

}
