package com.nlpeng.mall.service;

import com.nlpeng.mall.dto.OssCallbackResult;
import com.nlpeng.mall.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v5/17.
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
