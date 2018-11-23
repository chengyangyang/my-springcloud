package ch.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月22日 18:13
 * version 1.0
 */
@RestController
public class ConfigController {

    @Value("${user.age}")
    private String name;

    @GetMapping("/getConfig")
    public String findConfig(){
        return name;
    }

}
