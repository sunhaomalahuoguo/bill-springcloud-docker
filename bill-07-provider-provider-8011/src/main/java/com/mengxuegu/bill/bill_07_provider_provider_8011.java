package com.mengxuegu.bill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author sunhao
 * @create 2019/5/2
 * @since 1.0.0
 */
@MapperScan("com.mengxuegu.bill.mapper")
@EnableEurekaClient
@SpringBootApplication
public class bill_07_provider_provider_8011 {

    public static void main(String[] args) {
        SpringApplication.run(bill_07_provider_provider_8011.class,args);
    }
}