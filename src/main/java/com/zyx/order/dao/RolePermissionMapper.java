package com.zyx.order.dao;

import com.zyx.order.pojo.RolePermission;
import com.zyx.order.pojo.RolePermissionExample;

import java.util.List;

public interface RolePermissionMapper extends SysDao<RolePermission>{

    List<RolePermission> selectByExample(RolePermissionExample example);

}