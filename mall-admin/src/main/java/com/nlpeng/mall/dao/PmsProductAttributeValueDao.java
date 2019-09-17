package com.nlpeng.mall.dao;

import com.nlpeng.mall.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品参数，商品自定义规格属性Dao
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v4/26.
 */
public interface PmsProductAttributeValueDao {
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}
