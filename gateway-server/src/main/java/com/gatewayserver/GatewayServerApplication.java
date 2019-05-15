package com.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关服务
 *
 * @author 宋长军
 * @date 2019/5/14 19:36
 **/
@EnableZuulProxy
@SpringBootApplication
public class GatewayServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(GatewayServerApplication.class, args);
    }
}
