package com.nlpeng.mall.dao;

import com.nlpeng.mall.model.SmsCouponProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 优惠券和产品关系自定义Dao
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v8/28.
 */
public interface SmsCouponProductRelationDao {
    int insertList(@Param("list") List<SmsCouponProductRelation> productRelationList);
}
