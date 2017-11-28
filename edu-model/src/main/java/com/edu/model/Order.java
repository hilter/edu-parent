package com.edu.model;

import java.util.Date;

public class Order {
    private Integer oId;

    private Integer userId;

    private Float orderCount;

    private Integer state;

    private Date orderTime;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Float orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
}