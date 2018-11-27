package ch;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月19日 17:03
 * version 1.0
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ZuulApplication {

    public static void main(String[] args) {
        //SpringApplication.run(StartZuul.class,args);
        new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
    }
}
