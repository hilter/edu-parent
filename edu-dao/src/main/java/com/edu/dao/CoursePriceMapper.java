package com.edu.dao;

import com.edu.model.CoursePrice;

public interface CoursePriceMapper {
    int deleteByPrimaryKey(Integer priceId);

    int insert(CoursePrice record);

    int insertSelective(CoursePrice record);

    CoursePrice selectByPrimaryKey(Integer priceId);

    int updateByPrimaryKeySelective(CoursePrice record);

    int updateByPrimaryKey(CoursePrice record);
}