package com.nlpeng.mall.dto;


/**
 * 商品分类对应属性信息
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v5/23.
 */
public class ProductAttrInfo {
    private Long attributeId;
    private Long attributeCategoryId;

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    public Long getAttributeCategoryId() {
        return attributeCategoryId;
    }

    public void setAttributeCategoryId(Long attributeCategoryId) {
        this.attributeCategoryId = attributeCategoryId;
    }
}
