package com.thoughtpeak.starter.uiwebapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * This class is used to bootstrap the data-access layer objects
 * in spring
 */
@Configuration
@PropertySource("application.properties")
@Profile("dev")
@ComponentScan("org.regenstrief.starter.data")
//@EnableTransactionManagement
public class JdbcConfig {

    @Autowired
    private Environment env;

    @Bean(name="dataSource")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(env.getProperty("jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.user"));
        dataSource.setPassword(env.getProperty("jdbc.pass"));

        return dataSource;
    }

    @Bean(name = "platformTransactionManager")
    public DataSourceTransactionManager getTransactionManager(
            @Qualifier(value = "dataSource") final DriverManagerDataSource manageToolDataSource) {
        DataSourceTransactionManager dstm = new DataSourceTransactionManager();
        dstm.setDataSource(manageToolDataSource);
        return dstm;
    }

    @Bean(name = "transactionManager")
    public DataSourceTransactionManager getTransactionManagerAlso(
            @Qualifier(value = "dataSource") final DriverManagerDataSource manageToolDataSource) {
        DataSourceTransactionManager dstm = new DataSourceTransactionManager();
        dstm.setDataSource(manageToolDataSource);
        return dstm;
    }
}

