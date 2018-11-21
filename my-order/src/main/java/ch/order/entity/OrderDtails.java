package ch.order.entity;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月21日 11:00
 * version 1.0
 */
public class OrderDtails {

    private String orderId;
    private Goods goods;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
