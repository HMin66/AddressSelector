package com.smarttop.library.bean;
/**
 * Created by smartTop on 2016/10/19.
 * 区 乡镇的实体类
 */
public class County {
    public int id;
    public String name;
    public String code;

    public County() {
    }

    public County(int id, String name) {
        this.id = id;
        this.name = name;
    }
}