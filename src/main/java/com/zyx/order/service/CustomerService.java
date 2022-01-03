package com.zyx.order.service;

import com.zyx.order.pojo.Customer;

public interface CustomerService extends CrudService<Customer>{

    /**
     * 返回登陆的用户
     * @param customer
     * @return
     */
    Customer foreLogin(Customer customer);

    /**
     * 设置会员
     * @param id
     */
    void shezhihuiyuan(int id);



}
