package com.bawei.scenic.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bawei.scenic.entity.Scenic;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bawei.scenic.entity.ScenicVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qyc
 * @since 2020-03-15
 */
public interface IScenicService extends IService<Scenic> {

    IPage<Scenic> selectScenicpageVo(Page page, ScenicVo scenicVo);
}
