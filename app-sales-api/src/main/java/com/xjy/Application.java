package com.xjy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * server服务启动运行类
 *
 * @author snow
 * @version 1.0, 2017-05-25
 */
@EnableAsync
@EnableTransactionManagement
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.xjy")
@SpringBootApplication(scanBasePackages = "com.xjy")
@EnableHystrixDashboard
@EnableCircuitBreaker
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
