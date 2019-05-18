package com.cashbook.config;

import com.alipay.api.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: longtao
 * @Date: 2019/5/18 00:57
 * @Description:
 */
@Configuration
public class LogConfig {
    private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);
    @Bean
    public Person logMethod() {
        LOG.info("==========print log==========");
        return new Person();
    }
}
