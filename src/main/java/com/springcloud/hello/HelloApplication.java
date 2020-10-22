package com.springcloud.hello;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        int port = 8081;
        if(!NetUtil.isUsableLocalPort(port)) {
            System.err.printf("端口%d被占用了，无法启动%n", port );
            System.exit(1);
        }

        //SpringApplication.run(HelloApplication.class, args);
        new SpringApplicationBuilder(HelloApplication.class)
                .properties("server.port=" + port).run(args);
    }

}
