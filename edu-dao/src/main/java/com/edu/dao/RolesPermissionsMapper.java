package com.edu.dao;

import com.edu.model.RolesPermissions;

public interface RolesPermissionsMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(RolesPermissions record);

    int insertSelective(RolesPermissions record);

    RolesPermissions selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(RolesPermissions record);

    int updateByPrimaryKey(RolesPermissions record);
}