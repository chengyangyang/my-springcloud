package ch.start;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description:启动eureka的类
 *
 * @author cy
 * @date 2018年11月12日 13:52
 * version 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class StartEureka {

    public static void main(String[] args) {
        SpringApplication.run(StartEureka.class,args);
        //new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
