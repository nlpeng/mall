package com.nlpeng.mall.service;

import com.nlpeng.mall.model.SmsCouponHistory;

import java.util.List;

/**
 * 优惠券领取记录管理Service
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v11/6.
 */
public interface SmsCouponHistoryService {
    /**
     * 分页查询优惠券领取记录
     * @param couponId 优惠券id
     * @param useStatus 使用状态
     * @param orderSn 使用订单号码
     */
    List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum);
}
