package com.bawei.scenic.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class NationVo implements Serializable {
    //对应数据库的id cid did
    private Integer value;
    //对应数据的province city district
    private String label;
    //子集合
    private List<NationVo> children;
}
