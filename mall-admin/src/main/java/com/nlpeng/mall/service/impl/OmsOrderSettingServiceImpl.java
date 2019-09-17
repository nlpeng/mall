package com.nlpeng.mall.service.impl;

import com.nlpeng.mall.mapper.OmsOrderSettingMapper;
import com.nlpeng.mall.model.OmsOrderSetting;
import com.nlpeng.mall.service.OmsOrderSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单设置管理Service实现类
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v10/16.
 */
@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {
    @Autowired
    private OmsOrderSettingMapper orderSettingMapper;

    @Override
    public OmsOrderSetting getItem(Long id) {
        return orderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, OmsOrderSetting orderSetting) {
        orderSetting.setId(id);
        return orderSettingMapper.updateByPrimaryKey(orderSetting);
    }
}
