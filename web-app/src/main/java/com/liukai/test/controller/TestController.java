package com.liukai.test.controller;

import atg.taglib.json.util.Test;
import com.alibaba.dubbo.config.annotation.DubboReference;
import com.liukai.test.dto.TestDto;
import com.liukai.test.interfaces.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Kay on 2017/5/27.
 */
@Controller
@RequestMapping(path = "/test")
public class TestController {

    @DubboReference
    private TestService testService;

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public ModelAndView test() {
        List<TestDto> results = testService.getList();

        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("list", results);

        return mav;
    }

    @RequestMapping(path = "/add", method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView("add");
        mav.addObject("testDto", new TestDto());

        return mav;
    }

    @RequestMapping(path = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("add");
        TestDto detail = testService.find(id);
        mav.addObject("testDto", detail);

        return mav;
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String save(@Valid TestDto testDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "add";
        }
        testService.save(testDto);

        return "redirect:/test/list";
    }

    @RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {
        testService.delete(id);

        return "redirect:/test/list";
    }

}
