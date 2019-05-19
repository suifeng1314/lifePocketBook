package com.cashbook.service.Impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.request.AlipayUserInfoShareRequest;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.alipay.api.response.AlipayUserInfoShareResponse;
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
    private static final Logger logger = LoggerFactory.getLogger(AliPayServiceImpl.class);
    @Value("${alipay.appId}")
    private String appId;
    @Value("${alipay.privateKey}")
    private String privateKey;
    @Value("${alipay.publicKey}")
    private String publicKey;


    @Override
    public String getAccessToken(String code) throws AlipayApiException {
        System.out.println("appId:"+appId);
        System.out.println("privateKey:" + privateKey);
        System.out.println("publicKey:" + publicKey);
        System.out.println();
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",appId,privateKey,"json","GBK",publicKey,"RSA2");
        AlipaySystemOauthTokenRequest request = new AlipaySystemOauthTokenRequest();
        request.setGrantType("authorization_code");
        request.setCode(code);// 前端code
        request.setRefreshToken("201208134b203fe6c11548bcabd8da5bb087a83b");
        AlipaySystemOauthTokenResponse response = alipayClient.execute(request);
        if (response.isSuccess()){
            System.out.println(11111);
            logger.info("调用成功");
            return response.getAccessToken();
        }
        System.out.println(11111+"~~~~~~~~~~");
        logger.info("调用失败");
        return null;
    }

    @Override
    public String getUserInfo(String token) throws AlipayApiException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do",appId,privateKey,"json","GBK",publicKey,"RSA2");
        AlipayUserInfoShareRequest request = new AlipayUserInfoShareRequest();
        AlipayUserInfoShareResponse response = alipayClient.execute(request,token);
        if(response.isSuccess()){
            System.out.println("调用成功");
            return response.getCity();
        }
        return null;
    }
}
