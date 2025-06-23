package com.chenjiacheng.datasource.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by chenjiacheng on 2025/6/24 02:13
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@RequestMapping("/healthy")
public class HealthyController {

    /**
     * 健康检查接口
     *
     * @return String
     */
    @RequestMapping(method = RequestMethod.GET,value = "/get")
    public String health() {
        return "OK";
    }
}
