package com.nlpeng.mall.dao;

import com.nlpeng.mall.model.SmsCouponProductCategoryRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 优惠券和商品分类关系自定义Dao
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v8/28.
 */
public interface SmsCouponProductCategoryRelationDao {
    int insertList(@Param("list") List<SmsCouponProductCategoryRelation> productCategoryRelationList);
}
