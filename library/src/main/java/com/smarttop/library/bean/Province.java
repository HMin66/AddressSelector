package com.smarttop.library.bean;

/**
 * Created by smartTop on 2016/10/19.
 * 省份的实体类
 */

public class Province {
    public int id;
    public String name;
    public String code;

    public Province() {
    }

    public Province(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
