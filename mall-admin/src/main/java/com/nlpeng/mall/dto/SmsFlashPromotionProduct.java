package com.nlpeng.mall.dto;

import com.nlpeng.mall.model.PmsProduct;
import com.nlpeng.mall.model.SmsFlashPromotionProductRelation;
import lombok.Getter;
import lombok.Setter;

/**
 * 限时购及商品信息封装
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v11/16.
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation{
    @Getter
    @Setter
    private PmsProduct product;
}
