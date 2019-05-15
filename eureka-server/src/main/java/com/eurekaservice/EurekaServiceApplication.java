package com.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka-Service 服务注册中心
 *
 * @author 宋长军
 * @date 2019/5/14 19:29
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaServiceApplication.class, args);
    }
}
