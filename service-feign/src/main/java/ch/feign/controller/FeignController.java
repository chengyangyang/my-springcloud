package ch.feign.controller;

import ch.feign.entity.Goods;
import ch.feign.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月20日 14:20
 * version 1.0
 */
@RestController
public class FeignController {

    @Autowired
    GoodsService goodsService;

    @GetMapping("/test/findById")
    public Goods getGoods(@RequestParam("id") String id) {
        return goodsService.queryGoodsById(id);
    }

}
