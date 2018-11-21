package ch.order.service;

import ch.order.entity.Goods;
import ch.order.entity.Order;
import ch.order.entity.OrderDtails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月21日 11:05
 * version 1.0
 */
@Service
public class OrderService {

    private static final Map<String,Order> map = new HashMap<>();

    static {
        //创建数据的测试
        Order order = new Order();
        order.setId("1");
        order.setCreateDate(new Date());
        order.setUserNo("cheng");
        order.setUpdateDate(order.getCreateDate());

        //创建订单详情
        ArrayList<OrderDtails> detailsList = new ArrayList<>();

        OrderDtails orderDtails = new OrderDtails();
        orderDtails.setOrderId("1");
        //创建商品
        Goods goods = new Goods();
        goods.setId("11");
        orderDtails.setGoods(goods);
        detailsList.add(orderDtails);

        OrderDtails orderDtails1 = new OrderDtails();
        orderDtails1.setOrderId("2");
        //创建商品
        Goods goods1 = new Goods();
        goods1.setId("12");
        orderDtails1.setGoods(goods);
        detailsList.add(orderDtails1);

        order.setOrderTails(detailsList);
        map.put(order.getId(),order);

    }

    /**
     * 订单查询
     * @param orderId
     * @return
     */
    public Order queryOrderById(String orderId){
        return map.get(orderId);
    }

}
