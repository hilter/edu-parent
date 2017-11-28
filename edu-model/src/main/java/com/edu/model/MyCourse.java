package com.edu.model;

import java.util.Date;

public class MyCourse {
    private Integer myCourseId;

    private Integer courseId;

    private Integer userId;

    private String status;

    private Date createTime;

    private Date effectiveTime;

    public Integer getMyCourseId() {
        return myCourseId;
    }

    public void setMyCourseId(Integer myCourseId) {
        this.myCourseId = myCourseId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }
}