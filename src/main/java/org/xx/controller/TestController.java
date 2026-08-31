package org.xx.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xueqimiao
 * @Date: 2025/7/28 16:30
 */
@RestController
@CrossOrigin
public class TestController {

    // http://127.0.0.1:8001/test
    @RequestMapping("/test")
    public String test() {
        return "hello v1";
    }
}