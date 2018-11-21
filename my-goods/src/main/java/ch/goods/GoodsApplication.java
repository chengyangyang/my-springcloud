package ch.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月12日 13:52
 * version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient   // 声明这是eureka的客户端,这个和@EnableEurekaClient的区别是,它可以使用其他注册中心
public class GoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class,args);
        //new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
