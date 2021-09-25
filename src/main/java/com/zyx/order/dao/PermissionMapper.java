package com.zyx.order.dao;

import com.zyx.order.pojo.Permission;
import com.zyx.order.pojo.PermissionExample;

import java.util.List;

public interface PermissionMapper extends SysDao<Permission>{

    List<Permission> selectByExample(PermissionExample example);

}