package com.github.ynhj123.demo.service;

import com.github.ynhj123.demo.entity.Person;

public interface HelloService {

    String hello(String name);

    String hello(Person person);
}
