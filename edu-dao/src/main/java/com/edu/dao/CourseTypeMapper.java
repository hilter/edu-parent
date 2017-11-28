package com.edu.dao;

import com.edu.model.CourseType;

public interface CourseTypeMapper {
    int deleteByPrimaryKey(Integer subjectId);

    int insert(CourseType record);

    int insertSelective(CourseType record);

    CourseType selectByPrimaryKey(Integer subjectId);

    int updateByPrimaryKeySelective(CourseType record);

    int updateByPrimaryKey(CourseType record);
}