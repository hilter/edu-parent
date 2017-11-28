package com.edu.dao;

import com.edu.model.TearcherGrade;

public interface TearcherGradeMapper {
    int deleteByPrimaryKey(Integer rankId);

    int insert(TearcherGrade record);

    int insertSelective(TearcherGrade record);

    TearcherGrade selectByPrimaryKey(Integer rankId);

    int updateByPrimaryKeySelective(TearcherGrade record);

    int updateByPrimaryKey(TearcherGrade record);
}