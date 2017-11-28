package com.edu.dao;

import com.edu.model.WageRecord;

public interface WageRecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(WageRecord record);

    int insertSelective(WageRecord record);

    WageRecord selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(WageRecord record);

    int updateByPrimaryKey(WageRecord record);
}