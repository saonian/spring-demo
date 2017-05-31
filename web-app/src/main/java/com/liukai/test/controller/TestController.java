package com.liukai.test.controller;

import com.alibaba.dubbo.config.annotation.DubboReference;
import com.liukai.test.dto.TestDto;
import com.liukai.test.interfaces.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Kay on 2017/5/27.
 */
@Controller
public class TestController {

    @DubboReference
    private TestService testService;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String test() {
        List<TestDto> results = testService.getList();
        System.out.print(results.get(0).getTitle());
        return "hello";
    }

}
