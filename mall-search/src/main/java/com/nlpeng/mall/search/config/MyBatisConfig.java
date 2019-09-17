package com.nlpeng.mall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v
 **/
@Configuration
@MapperScan({"com.nlpeng.mall.mapper","com.nlpeng.mall.search.dao"})
public class MyBatisConfig {
}
