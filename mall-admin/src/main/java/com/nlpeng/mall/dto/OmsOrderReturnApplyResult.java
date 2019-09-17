package com.nlpeng.mall.dto;

import com.nlpeng.mall.model.OmsCompanyAddress;
import com.nlpeng.mall.model.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v10/18.
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
