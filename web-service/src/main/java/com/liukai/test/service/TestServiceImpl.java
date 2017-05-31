package com.liukai.test.service;

import com.alibaba.dubbo.config.annotation.DubboService;
import com.liukai.test.dao.TestDao;
import com.liukai.test.dto.TestDto;
import com.liukai.test.interfaces.TestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Kay on 2017/5/27.
 */
@DubboService
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<TestDto> getList() {
        return testDao.getList();
    }
}
