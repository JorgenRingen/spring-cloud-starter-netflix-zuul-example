package org.example.router;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DemoRouter {

    public static void main(String[] args) {
        SpringApplication.run(DemoRouter.class, args);
    }
}
