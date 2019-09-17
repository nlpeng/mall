package com.nlpeng.mall.dto;

import com.nlpeng.mall.model.SmsFlashPromotionSession;
import lombok.Getter;
import lombok.Setter;

/**
 * 包含商品数量的场次信息
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v11/19.
 */
public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {
    @Setter
    @Getter
    private Long productCount;
}
