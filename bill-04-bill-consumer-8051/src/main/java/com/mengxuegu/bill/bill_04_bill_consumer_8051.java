package com.mengxuegu.bill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author sunhao
 * @create 2019/5/1
 * @since 1.0.0
 */
@EnableFeignClients(basePackages = "com.mengxuegu.bill.service")
@EnableEurekaClient
@SpringBootApplication
public class bill_04_bill_consumer_8051 {
    public static void main(String[] args) {
        SpringApplication.run(bill_04_bill_consumer_8051.class,args);
    }
}