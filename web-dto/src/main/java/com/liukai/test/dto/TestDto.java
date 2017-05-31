package com.liukai.test.dto;

import java.io.Serializable;

/**
 * Created by Kay on 2017/5/31.
 */
public class TestDto implements Serializable {

    private static final long serialVersionUID = -6162489527040164439L;
    private int id;

    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
