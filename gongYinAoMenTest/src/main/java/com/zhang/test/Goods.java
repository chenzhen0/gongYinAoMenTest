package com.zhang.test;

import java.math.BigDecimal;

public class Goods {

    //商品名称
    private String name;

    //价格
    private BigDecimal price;

    //商品专属折扣
    private BigDecimal discount=BigDecimal.valueOf(1);

    public Goods(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public Goods(String name, BigDecimal price, BigDecimal discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price.multiply(discount);
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}
