package com.nlpeng.mall.service;

import com.nlpeng.mall.model.CmsSubject;

import java.util.List;

/**
 * 商品专题Service
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v6/1.
 */
public interface CmsSubjectService {
    /**
     * 查询所有专题
     */
    List<CmsSubject> listAll();

    /**
     * 分页查询专题
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
