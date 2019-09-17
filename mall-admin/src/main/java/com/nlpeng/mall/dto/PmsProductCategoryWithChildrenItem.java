package com.nlpeng.mall.dto;

import com.nlpeng.mall.model.PmsProductCategory;

import java.util.List;

/**
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v5/25.
 */
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    private List<PmsProductCategory> children;

    public List<PmsProductCategory> getChildren() {
        return children;
    }

    public void setChildren(List<PmsProductCategory> children) {
        this.children = children;
    }
}
