package com.mengxuegu.bill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author sunhao
 * @create 2019/5/2
 * @since 1.0.0
 */
@EnableConfigServer
@SpringBootApplication
public class bill_09_config_server_5001 {

    public static void main(String[] args) {
        SpringApplication.run(bill_09_config_server_5001.class,args);
    }
}