package com.nlpeng.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by nlpeng on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.nlpeng.mall.mapper","com.nlpeng.mall.dao"})
public class MyBatisConfig {
}
