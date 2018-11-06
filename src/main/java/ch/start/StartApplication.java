package ch.start;
import java.util.Properties;

/**
 * 启动类
 */
import org.mybatis.spring.annotation.MapperScan;

/**
 * 启动类
 * 
 * 
 * */

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.github.pagehelper.PageHelper;


@Controller
@SpringBootApplication
@MapperScan("com.khwb.dao")
@ComponentScan("com.*")
public class StartApplication {
	
	/*启动测试*/
	@RequestMapping("/")
	    @ResponseBody
	    String home() {
	        return "Hello World!";
	    }
	
	//分页插件
	 @Bean
     public PageHelper pageHelper(){
         PageHelper pageHelper = new PageHelper();
         Properties properties = new Properties();
         properties.setProperty("offsetAsPageNum","true");
         properties.setProperty("rowBoundsWithCount","true");
         properties.setProperty("reasonable","true");
         properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
       System.out.println("分页插件已经启动");
        return pageHelper;
    }
	

	/* 启动入口*/
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}