package com.nlpeng.mall.dao;

import com.nlpeng.mall.model.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品和专题关系操作
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v4/26.
 */
public interface CmsSubjectProductRelationDao {
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
