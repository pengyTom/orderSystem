package com.zyx.order.dao;

import com.zyx.order.pojo.Order;
import com.zyx.order.pojo.OrderExample;

import java.util.List;

public interface OrderMapper extends CrudDao<Order>{

    List<Order> selectByExample(OrderExample example);

}