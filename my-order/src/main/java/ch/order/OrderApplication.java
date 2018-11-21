package ch.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月12日 13:52
 * version 1.0
 */
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
        //new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
