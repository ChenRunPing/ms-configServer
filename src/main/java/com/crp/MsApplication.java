package com.crp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * com.crp
 *
 * @author rpchen3
 * @create 2019-02-27 10:46
 **/
@SpringBootApplication
@EnableConfigServer
public class MsApplication {

    public static void main(String[] args){

        SpringApplication.run(MsApplication.class, args);

    }
}
