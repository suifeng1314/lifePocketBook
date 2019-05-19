package com.cashbook.service;

import com.alipay.api.AlipayApiException;

/**
 * @Auther: longtao
 * @Date: 2019/5/18 01:12
 * @Description:
 */
public interface AliPayService {
    String getAccessToken(String code) throws AlipayApiException;
    /**
     * @Description: 获取会员信息
     * @auther: longtao
     * @param: token 请求令牌
     * @date:  2019/5/18 23:42 
     * @return: java.lang.String
     */
    String getUserInfo(String token) throws AlipayApiException;

}
