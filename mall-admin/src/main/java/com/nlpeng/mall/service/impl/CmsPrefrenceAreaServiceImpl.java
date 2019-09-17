package com.nlpeng.mall.service.impl;

import com.nlpeng.mall.mapper.CmsPrefrenceAreaMapper;
import com.nlpeng.mall.model.CmsPrefrenceArea;
import com.nlpeng.mall.model.CmsPrefrenceAreaExample;
import com.nlpeng.mall.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选Service实现类
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v6/1.
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
