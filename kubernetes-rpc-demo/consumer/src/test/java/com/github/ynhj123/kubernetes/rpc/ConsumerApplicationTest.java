package com.github.ynhj123.kubernetes.rpc;

import com.github.ynhj123.demo.entity.Person;
import com.github.ynhj123.demo.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerApplicationTest {
    @Autowired
    HelloService helloService;

    @Test
    void hello() {
        String ynhj = helloService.hello("ynhj");
        System.out.println(ynhj);
    }

    @Test
    void helloPerson() {
        Person person = new Person();
        person.setFirstName("yn");
        person.setLastName("hj");
        String hello = helloService.hello(person);
        System.out.println(hello);
    }

}