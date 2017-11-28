package com.edu.model;

import java.util.Date;

public class ShoppingCart {
    private Integer cartId;

    private Integer userId;

    private Integer courseId;

    private Integer count;

    private Float tatolPrice;

    private Date createTime;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getTatolPrice() {
        return tatolPrice;
    }

    public void setTatolPrice(Float tatolPrice) {
        this.tatolPrice = tatolPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}