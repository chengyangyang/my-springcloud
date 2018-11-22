package ch.feign.service;

import ch.feign.entity.Goods;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月21日 9:43
 * version 1.0
 */
@FeignClient("my-goods")
public interface GoodsService {

    @GetMapping("/goods/{id}")
    public Goods queryGoodsById(@PathVariable("id") String id);
}
