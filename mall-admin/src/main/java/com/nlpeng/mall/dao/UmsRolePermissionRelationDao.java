package com.nlpeng.mall.dao;

import com.nlpeng.mall.model.UmsPermission;
import com.nlpeng.mall.model.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户角色管理自定义Dao
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v9/30.
 */
public interface UmsRolePermissionRelationDao {
    /**
     * 批量插入角色和权限关系
     */
    int insertList(@Param("list") List<UmsRolePermissionRelation> list);

    /**
     * 根据角色获取权限
     */
    List<UmsPermission> getPermissionList(@Param("roleId") Long roleId);
}
