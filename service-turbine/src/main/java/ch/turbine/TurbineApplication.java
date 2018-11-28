package ch.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月28日 17:07
 * version 1.0
 */
@EnableDiscoveryClient
@EnableTurbine
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class,args);
    }
}
