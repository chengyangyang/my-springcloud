package ch.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月12日 13:52
 * version 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
        //new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
