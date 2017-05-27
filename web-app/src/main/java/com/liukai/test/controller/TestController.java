package com.liukai.test.controller;

import com.liukai.test.dto.TestDto;
import com.liukai.test.interfaces.TestService;
import com.liukai.test.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Kay on 2017/5/27.
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String test() {
        List<TestDto> results = testService.getList();
        System.out.print(results.get(0).getTitle());
        return "hello";
    }

}