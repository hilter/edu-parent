package com.edu.dao;

import com.edu.model.Navigation;

public interface NavigationMapper {
    int deleteByPrimaryKey(Integer navigationId);

    int insert(Navigation record);

    int insertSelective(Navigation record);

    Navigation selectByPrimaryKey(Integer navigationId);

    int updateByPrimaryKeySelective(Navigation record);

    int updateByPrimaryKey(Navigation record);
}