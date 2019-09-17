package com.nlpeng.mall.dao;

import com.nlpeng.mall.model.OmsOrderOperateHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单操作记录自定义Dao
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v10/12.
 */
public interface OmsOrderOperateHistoryDao {
    int insertList(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);
}
