package com.nlpeng.mall.search.dao;

import com.nlpeng.mall.search.domain.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 搜索系统中的商品管理自定义Dao
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
