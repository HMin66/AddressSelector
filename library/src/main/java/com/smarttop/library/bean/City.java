package com.smarttop.library.bean;
/**
 * Created by smartTop on 2016/10/19.
 * 城市的实体类
 */

public class City  {
    public int id;
    public String name;
    public String code;

    public City() {
    }

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }
}