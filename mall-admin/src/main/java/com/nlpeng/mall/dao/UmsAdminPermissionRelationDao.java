package com.nlpeng.mall.dao;

import com.nlpeng.mall.model.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户权限自定义Dao
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v10/8.
 */
public interface UmsAdminPermissionRelationDao {
    int insertList(@Param("list") List<UmsAdminPermissionRelation> list);
}
