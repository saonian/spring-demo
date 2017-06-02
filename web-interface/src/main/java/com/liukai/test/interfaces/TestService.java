package com.liukai.test.interfaces;

import com.liukai.test.dto.TestDto;

import java.util.List;

/**
 * Created by Kay on 2017/5/31.
 */
public interface TestService {

    TestDto find(int id);

    List<TestDto> getList();

    boolean save(TestDto testDto);

    boolean delete(int id);
}
