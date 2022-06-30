package com.github.ynhj123.kubernetes.rpc.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * RPC 请求注解（标注在服务实现类上）
 */
@Documented
@Target({ElementType.TYPE})//注解用在接口上
@Retention(RetentionPolicy.RUNTIME)//VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息
@Component
public @interface RpcService {

    Class<?> value();
}
