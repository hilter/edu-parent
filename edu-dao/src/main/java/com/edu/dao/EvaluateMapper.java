package com.edu.dao;

import com.edu.model.Evaluate;

public interface EvaluateMapper {
    int deleteByPrimaryKey(Integer evaId);

    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    Evaluate selectByPrimaryKey(Integer evaId);

    int updateByPrimaryKeySelective(Evaluate record);

    int updateByPrimaryKey(Evaluate record);
}