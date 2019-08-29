package com.futamilktea.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @auther: wulusai
 * @PackageName: com.futamilktea.account
 * @ClassName: AccountApplication
 * @Description:
 * @date: 2019/8/29 20:08
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.futamilktea.account.mapper")
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class);
    }
}
