package com.zyx.order.service;

import com.zyx.order.pojo.Category;
import com.zyx.order.pojo.Product;

import java.util.List;

public interface ForeService {

    /**
     * 返回保存6个分类对象的List集合
     * @return
     */
    public List<Category> listToThree();

    public List<Product> getFivePro();

}
