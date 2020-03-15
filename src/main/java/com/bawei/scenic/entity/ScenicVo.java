package com.bawei.scenic.entity;

import lombok.Data;

@Data
public class ScenicVo extends Scenic{
    //省
    private String provinceName;
    //市
    private String cityName;
    //区
    private String districtName;
    //风格
    private String tname;

    private Integer p1;
    private String p2;
    private Integer p3;
}
