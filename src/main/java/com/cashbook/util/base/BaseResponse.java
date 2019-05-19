package com.cashbook.util.base;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;


/**
 * Copyright (C), 2006-2010, ChengDu ybyainfo. Co., Ltd.
 * FileName: BaseResponse.java
 *
 * @version 1.00
 * @Author lt
 * @Date 2018/8/27 15:07
 **/
public class BaseResponse {
	
	public static Map<String, String> codeMsgMap = new HashMap();

	/**
	 * 根据响应码返回响应信息
	 * 
	 * @param code 响应码
	 * @return
	 */
	public static Object response(String code){
		return response(code, ResultCode.StringMsg(code));
	}

	/**
	 * 根据响应码返回响应信息
	 *
	 * @param code 响应码
	 * @return
	 */
	public static Object response(Byte code,String msg){
		return response(code.toString(), msg);
	}

	/**
	 * 根据响应码和data返回响应信息
	 * @param code 枚举code
	 * @param object data
	 * @return
	 */
	public static Object response(String code,Object object){
		JSONObject json = new JSONObject();
		json.put("code", code);
		json.put("msg", ResultCode.StringMsg(code));
		json.put("data",object);
		return json;
	}
	/**
	 * <ul>
	 * <li>自定义响应码和响应信息，并保存自定义响应码和响应信息
	 * <li>此方法返回的响应码和响应消息是暂时的，系统重启之后不保存
	 * </ul>
	 *
	 * @param code
	 * @param msg
	 * @return
	 */
	public static Object response(String code, String msg) {
		JSONObject json = new JSONObject();
		json.put("code", code);
		json.put("msg", msg);
		return json;
	}

	/**
	 * <ul>
	 * <li>自定义响应码和响应信息，并保存自定义响应码和响应信息
	 * <li>此方法返回的响应码和响应消息是暂时的，系统重启之后不保存
	 * </ul>
	 * 
	 * @param code
	 * @param msg
	 * @return
	 */
	public static Object response(String code, String msg,Object object) {
		JSONObject json = new JSONObject();
		json.put("code", code);
		json.put("msg", msg);
		json.put("data",object);
		return json;
	}
	
	/**
	 * 参数必填校验，错误信息返回
	 * 
	 * @param args
	 * @return
	 */
	public static String responseIsBlank(Object... args) {
		JSONObject json = new JSONObject();
		json.put("code", 40035);
		json.put("msg", "Parameters : " + args + " can not be blank");
		
		return json.toString();
	}

	/**
	 * @Description: 成功返回对象
	 * @auther: longtao
	 * @param: java.lang.Object
	 * @return: json
	 */
	public static Object response(Object obj){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "0");
		map.put("msg", "成功");
		map.put("data", format(obj));
		JSONObject json = new JSONObject(map);
		return json;
	}

	/**
	 * @Description: 判断是否为Page map list Bean类
	 * @auther: longtao
	 * @param: java.lang.Object
	 * @date:  2018/8/28 2:06
	 * @return: java.lang.Object
	 */
	private static Object format(Object obj) {
		try {
//			if (obj instanceof List){
//				return formatList(List<obj>)
//			}

			return obj;
		} catch (ClassCastException cce){
			return obj;
		} catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
