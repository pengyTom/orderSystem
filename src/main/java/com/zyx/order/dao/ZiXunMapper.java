package com.zyx.order.dao;

import com.zyx.order.pojo.ZiXun;
import com.zyx.order.pojo.ZiXunExample;

import java.util.List;

public interface ZiXunMapper extends CrudDao<ZiXun> {

    List<ZiXun> selectByExample(ZiXunExample example);

    /**
     * 资讯审核
     * @param zid
     */
    void shenhe(int zid);

}