package com.edu.dao;

import com.edu.model.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer deId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer deId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}