package com.edu.model;

import java.util.Date;

public class Consult {
    private Integer conId;

    private Integer contypeId;

    private String title;

    private Date uploadTime;

    private Date updateTime;

    private String operator;

    private String conContent;

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public Integer getContypeId() {
        return contypeId;
    }

    public void setContypeId(Integer contypeId) {
        this.contypeId = contypeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getConContent() {
        return conContent;
    }

    public void setConContent(String conContent) {
        this.conContent = conContent == null ? null : conContent.trim();
    }
}