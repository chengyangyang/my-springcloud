package ch.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月20日 10:58
 * version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {
    //第一次请求有时候会出现错误,重新请求就会好
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
