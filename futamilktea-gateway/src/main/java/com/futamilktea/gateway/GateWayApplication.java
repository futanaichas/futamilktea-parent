package com.futamilktea.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther: wulusai
 * @PackageName: com.futamilktea.gateway
 * @ClassName: GateWayApplication
 * @Description:
 * @date: 2019/8/29 19:50
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class);
    }
}
