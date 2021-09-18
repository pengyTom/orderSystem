package com.byh.biyesheji.service.impl;

import com.byh.biyesheji.dao.OrderMapper;
import com.byh.biyesheji.pojo.Customer;
import com.byh.biyesheji.pojo.Order;
import com.byh.biyesheji.pojo.OrderExample;
import com.byh.biyesheji.pojo.OrderItem;
import com.byh.biyesheji.service.CustomerService;
import com.byh.biyesheji.service.OrderItemService;
import com.byh.biyesheji.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    CustomerService customerService;
    @Autowired
    OrderItemService orderItemService;

    @Override
    public void save(Order c) {
        orderMapper.insert(c);
    }

    @Override
    public void del(int id) {
        orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Order c) {
        orderMapper.updateByPrimaryKeySelective(c);
    }

    @Override
    public Order get(int id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Order> list() {
        OrderExample example = new OrderExample();
        example.setOrderByClause("id desc");
        List<Order> result = orderMapper.selectByExample(example);
        setCust(result);
        return result;
    }

    public void setCust(List<Order> os) {
        for (Order o : os) {
            setCust(o);
        }
    }

    public void setCust(Order o) {
        int cstid = o.getCstid();
        Customer customer = customerService.get(cstid);
        o.setCustomer(customer);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackForClassName = "Exception")
    @Override
    public float add(Order o, List<OrderItem> ois) {
        float total = 0;
        //新增订单数据
        save(o);

        for (OrderItem oi : ois) {
            //给订单项设置订单id 关联起来
            oi.setOid(o.getId());
            orderItemService.update(oi);
            //商品的价格+当前订单项购买数量
            total += oi.getProduct().getPrice() * oi.getNumber();
        }
        return total;
    }

    @Override
    public List<Order> list(int cstid) {
        OrderExample example = new OrderExample();
        example.createCriteria().andCstidEqualTo(cstid);
        example.setOrderByClause("id asc");
        return orderMapper.selectByExample(example);
    }

}
