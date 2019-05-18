package com.cashbook.service.Impl;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.cashbook.service.AliPayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Auther: longtao
 * @Date: 2019/5/18 01:12
 * @Description:
 */
@Service
public class AliPayServiceImpl implements AliPayService {
    private static final Logger LOG = LoggerFactory.getLogger(AliPayServiceImpl.class);
    @Value("${alipay.appId}")
    private String appId;
    @Value("${alipay.rsa}")
    private String rsa;
    @Value("${alipay.res}")
    private String res;


    @Override
    public String getAccessToken(String code) {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do","app_id","your private_key","json","GBK","alipay_public_key","RSA2");
        AlipaySystemOauthTokenRequest request = new AlipaySystemOauthTokenRequest();
        request.setGrantType("authorization_code");
        request.setCode(code);// 前端code
        request.setRefreshToken("201208134b203fe6c11548bcabd8da5bb087a83b");
        return null;
    }
}
