package ch.order.service;

import ch.order.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月21日 9:43
 * version 1.0
 */
@Service
public class GoodsService {

    @Autowired
    private RestTemplate restTemplate;
    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    public Goods queryGoodsById(String id){
        Goods forEntity = restTemplate.getForObject("http://localhost:9000/goods/"+id, Goods.class);
        return forEntity;
    }
}
