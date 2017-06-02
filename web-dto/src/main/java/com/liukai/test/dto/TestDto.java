package com.liukai.test.dto;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import java.io.Serializable;

/**
 * Created by Kay on 2017/5/31.
 */
public class TestDto implements Serializable {

    private static final long serialVersionUID = -6162489527040164439L;

    private int id;

    @NotEmpty(message = "{title.empty}")
    @Length(min = 5, max = 50, message = "{title.length.illegal}")
    private String title;

    @NotEmpty(message = "{content.empty}")
    private String contents;

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

    public String getContents() {
        return contents;
    }

    public void setContents(String content) {
        this.contents = content;
    }
}
