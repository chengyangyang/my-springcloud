package ch.order.controller;

import ch.order.entity.Order;
import ch.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月21日 11:26
 * version 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 订单的查询
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Order queryOrderById(@PathVariable("id") String id){
        return orderService.queryOrderById(id);
    }
}
