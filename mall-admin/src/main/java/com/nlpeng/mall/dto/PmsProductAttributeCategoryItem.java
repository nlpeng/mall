package com.nlpeng.mall.dto;

import com.nlpeng.mall.model.PmsProductAttribute;
import com.nlpeng.mall.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * 包含有分类下属性的dto
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v5/24.
 */
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    private List<PmsProductAttribute> productAttributeList;

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }
}
