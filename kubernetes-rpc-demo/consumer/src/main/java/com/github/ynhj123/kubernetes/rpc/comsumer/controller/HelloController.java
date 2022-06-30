package com.github.ynhj123.kubernetes.rpc.comsumer.controller;

import com.github.ynhj123.demo.entity.Person;
import com.github.ynhj123.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date: 2022/6/30
 * @author: yangniuhaojiang
 * @title: HelloController
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(String name) {
        return helloService.hello(name);
    }

    @PostMapping("/hello")
    public String helloPeople(@RequestBody Person person) {
        return helloService.hello(person);
    }
}
