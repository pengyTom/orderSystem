package com.zyx.order.dao;

import com.zyx.order.pojo.UserRole;
import com.zyx.order.pojo.UserRoleExample;

import java.util.List;

public interface UserRoleMapper extends SysDao<UserRole>{

    List<UserRole> selectByExample(UserRoleExample example);

}