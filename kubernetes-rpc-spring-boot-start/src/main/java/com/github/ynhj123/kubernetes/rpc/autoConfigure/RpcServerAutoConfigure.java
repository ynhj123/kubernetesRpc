package com.github.ynhj123.kubernetes.rpc.autoConfigure;

import com.github.ynhj123.kubernetes.rpc.bean.RpcServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @date: 2022/6/30
 * @author: yangniuhaojiang
 * @title: RpcServerAutoConfigure
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
@Configuration
public class RpcServerAutoConfigure {
    @Value("${kubernetes.server.address}")
    private String serverAddress;

    @Bean
    @ConditionalOnMissingBean(RpcServer.class)
    public RpcServer rpcServer() {
        return new RpcServer(serverAddress);
    }
}
