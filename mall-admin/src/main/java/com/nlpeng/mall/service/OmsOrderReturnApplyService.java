package com.nlpeng.mall.service;

import com.nlpeng.mall.dto.OmsOrderReturnApplyResult;
import com.nlpeng.mall.dto.OmsReturnApplyQueryParam;
import com.nlpeng.mall.dto.OmsUpdateStatusParam;
import com.nlpeng.mall.model.OmsOrderReturnApply;

import java.util.List;

/**
 * 退货申请管理Service
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v10/18.
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
