package com.nlpeng.mall.dto;

import com.nlpeng.mall.model.OmsOrder;
import com.nlpeng.mall.model.OmsOrderItem;
import com.nlpeng.mall.model.OmsOrderOperateHistory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情信息
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v10/11.
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    private List<OmsOrderOperateHistory> historyList;
}
