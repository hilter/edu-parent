package com.edu.model;

public class ConsultType {
    private Integer contypeId;

    private String typeName;

    public Integer getContypeId() {
        return contypeId;
    }

    public void setContypeId(Integer contypeId) {
        this.contypeId = contypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}