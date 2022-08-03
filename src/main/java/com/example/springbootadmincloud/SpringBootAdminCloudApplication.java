package com.example.springbootadmincloud;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootAdminCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminCloudApplication.class, args);
    }

}
