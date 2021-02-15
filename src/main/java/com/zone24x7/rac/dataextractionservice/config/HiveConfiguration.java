package com.zone24x7.rac.dataextractionservice.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;

/**
 * Configuration related to hive
 */
@Configuration
public class HiveConfiguration {

//    private static final Logger logger = LoggerFactory.getLogger(HiveConfiguration.class);
//
//    @Value("${hive.url}")
//    private String url;
//
//    @Value("${hive.driver-class-name}")
//    private String driver;
//
//    @Value("${hive.username}")
//    private String user;
//
//    @Value("${hive.password}")
//    private String password;
//
//    @Bean("HiveDataSource")
//    public DataSource getHiveDataSource() throws IOException {
//        DataSource dataSource = new DataSource();
//        dataSource.setUrl(url);
//        dataSource.setDriverClassName(driver);
//        dataSource.setUsername(user);
//        dataSource.setPassword(password);
//        logger.info("Creating the data source");
//        return dataSource;
//
//    }
//
//    /**
//     * Method to pass the created hive connection with the jdbc template
//     *
//     * @return
//     * @throws IOException
//     */
//    @Bean("HiveConfig")
//    public JdbcTemplate createJdbcTemplate() throws IOException {
//        logger.info("Passing the Hive connection");
//        return new JdbcTemplate(getHiveDataSource());
//    }

}
