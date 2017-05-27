package com.liukai.test.dao;

import com.liukai.test.dto.TestDto;
import com.liukai.test.exceptions.DaoException;

import java.util.List;

/**
 * Created by Kay on 2017/5/27.
 */
public interface TestDao {

    List<TestDto> getList() throws DaoException;
}
