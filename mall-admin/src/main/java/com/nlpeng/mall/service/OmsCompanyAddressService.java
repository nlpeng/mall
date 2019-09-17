package com.nlpeng.mall.service;

import com.nlpeng.mall.model.OmsCompanyAddress;

import java.util.List;

/**
 * 收货地址管Service
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v10/18.
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
