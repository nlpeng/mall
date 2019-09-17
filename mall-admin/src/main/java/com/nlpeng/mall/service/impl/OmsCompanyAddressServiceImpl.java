package com.nlpeng.mall.service.impl;

import com.nlpeng.mall.mapper.OmsCompanyAddressMapper;
import com.nlpeng.mall.model.OmsCompanyAddress;
import com.nlpeng.mall.model.OmsCompanyAddressExample;
import com.nlpeng.mall.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v10/18.
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
