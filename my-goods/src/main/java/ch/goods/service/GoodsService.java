package ch.goods.service;

import ch.goods.entity.Goods;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月21日 9:43
 * version 1.0
 */
@Service
public class GoodsService {

    private static final Map<String,Goods> map = new HashMap<>();

    static {
        map.put("1",new Goods("1","标题1","http://a1","图片描述1",new BigDecimal("23.1")));
        map.put("2",new Goods("2","标题2","http://a2","图片描述2",new BigDecimal("23.2")));
        map.put("3",new Goods("3","标题3","http://a3","图片描述3",new BigDecimal("23.3")));
        map.put("4",new Goods("4","标题4","http://a4","图片描述4",new BigDecimal("23.4")));
        map.put("5",new Goods("5","标题5","http://a5","图片描述5",new BigDecimal("23.5")));
        map.put("6",new Goods("6","标题5","http://a6","图片描述6",new BigDecimal("23.6")));
        map.put("7",new Goods("7","标题7","http://a7","图片描述7",new BigDecimal("23.7")));
    }

    /**
     * 根据id进行查询
     * @param id
     * @return
     */
    public Goods queryGoodsById(String id){
        return map.get(id);
    }
}
