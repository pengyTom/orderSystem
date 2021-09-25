package com.zyx.order.dao;

import com.zyx.order.pojo.Role;
import com.zyx.order.pojo.RoleExample;

import java.util.List;

public interface RoleMapper extends SysDao<Role> {

    List<Role> selectByExample(RoleExample example);

}