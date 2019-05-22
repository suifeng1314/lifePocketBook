package com.cashbook.controller;

import com.alipay.api.AlipayApiException;
import com.cashbook.form.AccessTokenForm;
import com.cashbook.form.UserInfoForm;
import com.cashbook.model.AppUser;
import com.cashbook.service.AliPayService;
import com.cashbook.service.UserService;
import com.cashbook.util.base.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @Auther: longtao
 * @Date: 2019/5/17 23:25
 * @Description:
 */
@RestController
@Slf4j
@Api(value = "用户信息Api文档")
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @Autowired
    private AliPayService aliPayService;

    @ApiOperation(value = "test",httpMethod = "POST")
    @RequestMapping("/list")
    public Object getUsers(@RequestHeader String param){
        System.out.println(param+"");
        List<AppUser> list = userService.selectUserList();

        return BaseResponse.response(list);
    }
    @ApiOperation(value = "获取AccessToken",httpMethod = "POST")
    @ApiResponses(
            @ApiResponse(code = 200 , message = "code:状态码,msg:提示信息,data:数据")
    )
    @RequestMapping("/getAccessToken")
    public String getAccessToken(@RequestBody @Valid AccessTokenForm accessTokenForm){
        String token = null;
        String city = null;
        try {
            token = aliPayService.getAccessToken(accessTokenForm.getAuthCode());
            System.out.println("token:" + token);
//            city = aliPayService.getUserInfo(token);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return token;
    }

    @ApiOperation(value = "获取用户信息",httpMethod = "POST")
//    @ApiResponses(
//            @ApiResponse(code = 200 , message = "code:状态码,msg:提示信息,data:数据")
//    )
    @RequestMapping("/info")
    public String getUserInfo(@RequestBody @Valid UserInfoForm userInfoForm){
        String city = null;
        try {
            city = aliPayService.getUserInfo(userInfoForm.getToken());
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return city;
    }
}
