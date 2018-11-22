package ch.feign.entity;

import java.math.BigDecimal;

/**
 * Description:
 *
 * @author cy
 * @date 2018年11月21日 9:24
 * version 1.0
 */
public class Goods {

    private String id; //标识
    private String title; // 标题
    private String picPath; //图片地址
    private String desc; //描述信息
    private BigDecimal price; //价格


    public Goods() {
    }

    public Goods(String id, String title, String picPath, String desc, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.picPath = picPath;
        this.desc = desc;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
