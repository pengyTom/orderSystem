package com.zyx.order.dao;

import com.zyx.order.pojo.Category;
import com.zyx.order.pojo.CategoryExample;

import java.util.List;

public interface CategoryMapper extends CrudDao<Category>{

     List<Category> selectByExample(CategoryExample example);

}