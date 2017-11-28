package com.edu.model;

public class TearcherGrade {
    private Integer rankId;

    private String rankName;

    private Float reguler;

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName == null ? null : rankName.trim();
    }

    public Float getReguler() {
        return reguler;
    }

    public void setReguler(Float reguler) {
        this.reguler = reguler;
    }
}