package org.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling //启动调度
@SpringBootApplication
public class SpringbootJ4942Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJ4942Application.class, args);
    }
}
