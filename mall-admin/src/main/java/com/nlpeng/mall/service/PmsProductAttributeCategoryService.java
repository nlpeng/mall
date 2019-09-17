package com.nlpeng.mall.service;

import com.nlpeng.mall.dto.PmsProductAttributeCategoryItem;
import com.nlpeng.mall.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * 商品属性分类Service
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v4/26.
 */
public interface PmsProductAttributeCategoryService {
    int create(String name);

    int update(Long id, String name);

    int delete(Long id);

    PmsProductAttributeCategory getItem(Long id);

    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
