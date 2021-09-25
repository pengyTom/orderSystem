package com.zyx.order.dao;

import com.zyx.order.pojo.OrderItem;
import com.zyx.order.pojo.OrderItemExample;

import java.util.List;

public interface OrderItemMapper extends CrudDao<OrderItem>{

    List<OrderItem> selectByExample(OrderItemExample example);

}