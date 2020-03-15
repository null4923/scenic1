package com.bawei.scenic.controller;


import com.bawei.scenic.service.INationService;
import com.bawei.scenic.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 城市字典表 前端控制器
 * </p>
 *
 * @author qyc
 * @since 2020-03-15
 */
@RestController
@RequestMapping("/nation")
public class NationController {

    @Autowired
    private INationService iNationService;

    @RequestMapping("/list")
    public ResultEntity findAll(){

        return  ResultEntity.ok(iNationService.findAll());
    }
}

