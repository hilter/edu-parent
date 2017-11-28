package com.edu.dao;

import com.edu.model.ConsultType;

public interface ConsultTypeMapper {
    int deleteByPrimaryKey(Integer contypeId);

    int insert(ConsultType record);

    int insertSelective(ConsultType record);

    ConsultType selectByPrimaryKey(Integer contypeId);

    int updateByPrimaryKeySelective(ConsultType record);

    int updateByPrimaryKey(ConsultType record);
}