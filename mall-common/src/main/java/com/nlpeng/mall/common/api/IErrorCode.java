package com.nlpeng.mall.common.api;

/**
 * 封装API的错误码
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @since 1.0v
 **/
public interface IErrorCode {
	long getCode();//错误码
	String getMessage();//信息
}
