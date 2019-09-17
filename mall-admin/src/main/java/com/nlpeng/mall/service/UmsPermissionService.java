package com.nlpeng.mall.service;

import com.nlpeng.mall.dto.UmsPermissionNode;
import com.nlpeng.mall.model.UmsPermission;

import java.util.List;

/**
 * 后台用户权限管理Service
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v9/29.
 */
public interface UmsPermissionService {
    /**
     * 添加权限
     */
    int create(UmsPermission permission);

    /**
     * 修改权限
     */
    int update(Long id, UmsPermission permission);

    /**
     * 批量删除权限
     */
    int delete(List<Long> ids);

    /**
     * 以层级结构返回所有权限
     */
    List<UmsPermissionNode> treeList();

    /**
     * 获取所有权限
     */
    List<UmsPermission> list();
}
