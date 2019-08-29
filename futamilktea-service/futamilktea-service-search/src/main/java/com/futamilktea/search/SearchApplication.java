package com.futamilktea.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther: wulusai
 * @PackageName: com.futamilktea.search
 * @ClassName: SearchApplication
 * @Description:
 * @date: 2019/8/29 20:22
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.futamilktea.account.feign"}) //远程调用用谁就调谁
public class SearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class);
    }
}
