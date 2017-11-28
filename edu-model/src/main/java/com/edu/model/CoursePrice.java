package com.edu.model;

public class CoursePrice {
    private Integer priceId;

    private Integer gradeId;

    private Integer rankId;

    private Float originalPrice;

    private Float favorablePrice;

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public Float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Float getFavorablePrice() {
        return favorablePrice;
    }

    public void setFavorablePrice(Float favorablePrice) {
        this.favorablePrice = favorablePrice;
    }
}