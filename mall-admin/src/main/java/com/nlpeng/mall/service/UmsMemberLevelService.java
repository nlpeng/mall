package com.nlpeng.mall.service;

import com.nlpeng.mall.model.UmsMemberLevel;

import java.util.List;

/**
 * 会员等级管理Service
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v4/26.
 */
public interface UmsMemberLevelService {
    /**
     * 获取所有会员登录
     * @param defaultStatus 是否为默认会员
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
