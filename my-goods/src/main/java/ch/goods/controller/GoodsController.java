package ch.goods.controller;

import ch.goods.entity.Goods;
import ch.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月21日 9:56
 * version 1.0
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @GetMapping(value = "/{id}")
    public Goods queryGoodsById(@PathVariable(name = "id") String id){
        return goodsService.queryGoodsById(id);
    }


}
