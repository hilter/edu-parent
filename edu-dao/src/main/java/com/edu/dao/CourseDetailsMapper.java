package com.edu.dao;

import com.edu.model.CourseDetails;

public interface CourseDetailsMapper {
    int deleteByPrimaryKey(Integer courseId);

    int insert(CourseDetails record);

    int insertSelective(CourseDetails record);

    CourseDetails selectByPrimaryKey(Integer courseId);

    int updateByPrimaryKeySelective(CourseDetails record);

    int updateByPrimaryKey(CourseDetails record);
}