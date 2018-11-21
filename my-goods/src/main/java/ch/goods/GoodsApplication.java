package ch.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description:启动eureka的类
 *
 * @author cy
 * @date 2018年11月12日 13:52
 * version 1.0
 */
@SpringBootApplication
public class GoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class,args);
        //new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
