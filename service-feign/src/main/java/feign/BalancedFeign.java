package feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月20日 14:18
 * version 1.0
 */
@FeignClient(value = "user-center")
public interface BalancedFeign {

    @GetMapping("/test/findById")
    String sayFromClientOne(@RequestParam("id") String id);

}
