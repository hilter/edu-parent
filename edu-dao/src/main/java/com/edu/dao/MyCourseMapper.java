package com.edu.dao;

import com.edu.model.MyCourse;

public interface MyCourseMapper {
    int deleteByPrimaryKey(Integer myCourseId);

    int insert(MyCourse record);

    int insertSelective(MyCourse record);

    MyCourse selectByPrimaryKey(Integer myCourseId);

    int updateByPrimaryKeySelective(MyCourse record);

    int updateByPrimaryKey(MyCourse record);
}