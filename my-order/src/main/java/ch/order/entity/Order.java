package ch.order.entity;

import java.util.Date;
import java.util.List;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月21日 10:57
 * version 1.0
 */
public class Order {

    private String id;
    private String userNo;
    private Date createDate;
    private Date updateDate;
    private List<OrderDtails> orderTails;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public List<OrderDtails> getOrderTails() {
        return orderTails;
    }

    public void setOrderTails(List<OrderDtails> orderTails) {
        this.orderTails = orderTails;
    }
}
