package com.chenjiacheng.datasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Created by chenjiacheng on 2025/6/24 01:35
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class})
public class DatasourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatasourceApplication.class, args);
        log.info("DatasourceApplication has been started.");
    }
}