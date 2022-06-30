package com.github.ynhj123.kubernetes.rpc.comsumer.configure;

import com.github.ynhj123.cluster.RpcProxy;
import com.github.ynhj123.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @date: 2022/6/30
 * @author: yangniuhaojiang
 * @title: RpcConfigure
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
@Configuration
public class RpcConfigure {
    @Value("${kubernetes.server.address}")
    private String serverAddress;

    @Bean
    @ConditionalOnMissingBean(RpcProxy.class)
    public RpcProxy rpcProxy() {
        return new RpcProxy(serverAddress);
    }

    @Bean
    public HelloService helloService(RpcProxy rpcProxy) {
        return rpcProxy.create(HelloService.class);
    }
}
