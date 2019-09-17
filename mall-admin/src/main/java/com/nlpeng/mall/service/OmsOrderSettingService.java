package com.nlpeng.mall.service;

import com.nlpeng.mall.model.OmsOrderSetting;

/**
 * 订单设置Service
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v10/16.
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
