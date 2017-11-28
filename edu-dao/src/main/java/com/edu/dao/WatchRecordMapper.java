package com.edu.dao;

import com.edu.model.WatchRecord;

public interface WatchRecordMapper {
    int deleteByPrimaryKey(Integer recordId);

    int insert(WatchRecord record);

    int insertSelective(WatchRecord record);

    WatchRecord selectByPrimaryKey(Integer recordId);

    int updateByPrimaryKeySelective(WatchRecord record);

    int updateByPrimaryKey(WatchRecord record);
}