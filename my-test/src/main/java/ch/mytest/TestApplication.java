package ch.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;


/**
 * Description:
 *
 * @author cy
 * @date 2018年11月12日 13:52
 * version 1.0
 */
@SpringBootApplication
@ImportResource("classpath:beans.xml")  //对xml文件的加载
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class,args);
        //new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
