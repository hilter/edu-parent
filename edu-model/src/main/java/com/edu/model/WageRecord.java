package com.edu.model;

import java.util.Date;

public class WageRecord {
    private Integer recordId;

    private Integer teacherId;

    private Integer count;

    private Float bonus;

    private Date checkoutTime;

    private Float terProfit;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Float getBonus() {
        return bonus;
    }

    public void setBonus(Float bonus) {
        this.bonus = bonus;
    }

    public Date getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(Date checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public Float getTerProfit() {
        return terProfit;
    }

    public void setTerProfit(Float terProfit) {
        this.terProfit = terProfit;
    }
}