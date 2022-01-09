package com.zyx.order.service.impl;

import com.zyx.order.dao.CategoryMapper;
import com.zyx.order.dao.ProductMapper;
import com.zyx.order.pojo.Category;
import com.zyx.order.pojo.CategoryExample;
import com.zyx.order.pojo.Product;
import com.zyx.order.service.ForeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ForeServiceImpl implements ForeService {

    @Resource
    private CategoryMapper categoryMapper;
    @Resource
    private ProductMapper productMapper;

    @Override
    public List<Category> listToThree() {
        CategoryExample example = new CategoryExample();
        //从1开始计数
        example.createCriteria().andIdBetween(1, 4);
        return categoryMapper.selectByExample(example);
    }

    @Override
    public List<Product> getFivePro() {
        return productMapper.randFive();
    }


}
