package ch.feign.service;

import ch.feign.entity.Goods;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author cy  feign中短路器的使用,是进行方法的实现
 * @date 2018年11月22日 15:08
 * version 1.0
 */
@Component
public class GoodsServiceImpl implements GoodsService  {

    @Override
    public Goods queryGoodsById(String id) {
        Goods goods = new Goods();
        goods.setDesc("feign中调用goods接口出现错误!参数:"+id);
        return goods;
    }
}
