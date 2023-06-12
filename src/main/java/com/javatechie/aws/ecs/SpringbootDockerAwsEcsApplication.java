package com.javatechie.aws.ecs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class SpringbootDockerAwsEcsApplication {
    @Autowired
    private OrderDao orderDao;

    @GetMapping("/getOrders")
    public List<Order> getOrders() {
        return orderDao.getOrders();
    }

    @GetMapping("/{name}")
    public String welcome(@PathVariable String name) {
        return "Hi " + name + " Welcome to  AWS Codepipeline Example";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerAwsEcsApplication.class, args);
    }

}
