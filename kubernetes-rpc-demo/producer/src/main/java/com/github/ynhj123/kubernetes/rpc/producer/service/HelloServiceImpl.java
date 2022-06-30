package com.github.ynhj123.kubernetes.rpc.producer.service;


import com.github.ynhj123.demo.entity.Person;
import com.github.ynhj123.demo.service.HelloService;
import com.github.ynhj123.kubernetes.rpc.annotation.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        System.out.println("已经调用服务端接口实现，业务处理为：");
        System.out.println("Hello! " + name);
        return "Hello! " + name;
    }

    public String hello(Person person) {
        System.out.println("已经调用服务端接口实现，业务处理为：");
        System.out.println("Hello! " + person.getFirstName() + " " + person.getLastName());
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }
}
