package ch.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月12日 13:52
 * version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix    //开启断路器
public class OrderApplication {

    @Bean
    @LoadBalanced   //客户端的负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
        //new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
