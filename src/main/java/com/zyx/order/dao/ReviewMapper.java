package com.zyx.order.dao;

import com.zyx.order.pojo.Review;
import com.zyx.order.pojo.ReviewExample;

import java.util.List;

public interface ReviewMapper extends CrudDao<Review>{

    List<Review> selectByExample(ReviewExample example);

}