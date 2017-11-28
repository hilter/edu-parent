package com.edu.dao;

import com.edu.model.Consult;

public interface ConsultMapper {
    int deleteByPrimaryKey(Integer conId);

    int insert(Consult record);

    int insertSelective(Consult record);

    Consult selectByPrimaryKey(Integer conId);

    int updateByPrimaryKeySelective(Consult record);

    int updateByPrimaryKey(Consult record);
}