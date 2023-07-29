package com.jirafik.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class ApiGatewayApplication {

    /*
    minikube kube-dns addon ??
    https://stackoverflow.com/questions/48688339/kubernetes-service-discovery-doesnt-resolve-service-host-on-minikube
    java.net.UnknownHostException: Failed to resolve 'cats-api-567bbcc9fc-v4t42' [A(1)
    */

    public static void main(String[] args) {
        log.info("Initializing v5 cats-gateway: changed props");
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

}
