package com.bawei.scenic.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bawei.scenic.entity.Scenic;
import com.bawei.scenic.entity.ScenicVo;
import com.bawei.scenic.service.IScenicService;
import com.bawei.scenic.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qyc
 * @since 2020-03-15
 */
@RestController
@RequestMapping("/scenic")
public class ScenicController {

    @Autowired
    private IScenicService iScenicService;

    @RequestMapping("/list")
    public ResultEntity list(ScenicVo scenicVo, @RequestParam(defaultValue = "1")long current,
                             @RequestParam(defaultValue = "3")long size){

        Page page = new Page(current,size);
       IPage<Scenic> pageInfo = iScenicService.selectScenicpageVo(page,scenicVo);
       return  ResultEntity.ok(pageInfo);
    }

    @RequestMapping("/insert")
    public ResultEntity insert(@RequestBody ScenicVo entity){
        boolean flag = iScenicService.save(entity);
        return ResultEntity.ok(flag);
    }

    @RequestMapping("/update")
    public ResultEntity update(@RequestBody ScenicVo entity){
        boolean flag = iScenicService.updateById(entity);
        return ResultEntity.ok(flag);
    }

    @RequestMapping("/delete")
    public ResultEntity delete(Integer ids[]){
        boolean flag = iScenicService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(flag);
    }
}

