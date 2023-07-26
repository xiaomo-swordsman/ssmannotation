package com.xiaomo.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@PropertySource("classpath:jdbc.properties") // 加载properties文件 <context:property-placeholder location="jdbc.properties"/>
public class JdbcConfiguration {

    public class DataSourceConfiguration {
        @Value("${jdbc.driverClass}")
        private String driverClass;
        @Value("${jdbc.jdbcUrl}")
        private String jdbcUrl;
        @Value("${jdbc.user}")
        private String user;
        @Value("${jdbc.password}")
        private String password;

        // <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">...</bean>
        @Bean("dataSource")// Spring会将当前方法的返回值以指定的名称存储到spring容器中
        public DataSource getDataSource() throws PropertyVetoException {
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            dataSource.setDriverClass(driverClass);
            dataSource.setJdbcUrl(jdbcUrl);
            dataSource.setUser(user);
            dataSource.setPassword(password);
            return dataSource;
        }

    }
}
