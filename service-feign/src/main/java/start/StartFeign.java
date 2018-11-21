package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

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
public class StartFeign {

    public static void main(String[] args) {
        SpringApplication.run(StartFeign.class,args);
    }
}
