package com.mengxuegu.bill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author sunhao
 * @create 2019/5/1
 * @since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class bill_05_eureka_6001 {

    public static void main(String[] args) {
        SpringApplication.run(bill_05_eureka_6001.class,args);
    }
}