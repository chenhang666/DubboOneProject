package com.chen.dubbo.server.controller;

import com.chen.dubbo.api.enums.StatusCode;
import com.chen.dubbo.api.response.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ChenHang
 * @Description: TODO
 * @Date: 2019/2/22 11:27
 */

@RestController
public class BaseController {

    private static final Logger log = LoggerFactory.getLogger(BaseController.class);

    private  static final String prefix = "base";

    /**
     * 测试hello world
     * @param param
     * @return
     */
    @RequestMapping(value = prefix+"/one",method = RequestMethod.GET)
    public BaseResponse one (@RequestParam String param) {
        BaseResponse response = new BaseResponse(StatusCode.Success);
        return  response;

    }



}
