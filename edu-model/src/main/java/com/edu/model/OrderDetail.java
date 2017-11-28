package com.edu.model;

public class OrderDetail {
    private Integer deId;

    private Integer oId;

    private Integer courseId;

    private Integer count;

    private Float nuitPrice;

    private Float totalPrice;

    public Integer getDeId() {
        return deId;
    }

    public void setDeId(Integer deId) {
        this.deId = deId;
    }

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
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

    public Float getNuitPrice() {
        return nuitPrice;
    }

    public void setNuitPrice(Float nuitPrice) {
        this.nuitPrice = nuitPrice;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }
}