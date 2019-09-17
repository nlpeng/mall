package com.nlpeng.mall.dto;

/**
 * 查询单个产品进行修改时返回的结果
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v4/26.
 */
public class PmsProductResult extends PmsProductParam {
    //商品所选分类的父id
    private Long cateParentId;

    public Long getCateParentId() {
        return cateParentId;
    }

    public void setCateParentId(Long cateParentId) {
        this.cateParentId = cateParentId;
    }
}
