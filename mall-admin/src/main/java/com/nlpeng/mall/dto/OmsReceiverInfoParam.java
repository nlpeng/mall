package com.nlpeng.mall.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单修改收货人信息参数
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v10/29.
 */
@Getter
@Setter
public class OmsReceiverInfoParam {
    private Long orderId;
    private String receiverName;
    private String receiverPhone;
    private String receiverPostCode;
    private String receiverDetailAddress;
    private String receiverProvince;
    private String receiverCity;
    private String receiverRegion;
    private Integer status;
}
