package com.szzt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by anyauh
 * Date 2017-03-29
 */
@Controller
@RequestMapping("test")
public class TestController {

    @ResponseBody
    @RequestMapping("test")
    public String test(){
        System.out.println("fjeifjeifjeifjei");
        return "test";
    }

}



