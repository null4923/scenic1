package com.bawei.scenic.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bawei.scenic.entity.Scenic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bawei.scenic.entity.ScenicVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author qyc
 * @since 2020-03-15
 */
public interface ScenicMapper extends BaseMapper<Scenic> {

    IPage<Scenic> selectScenicpageVo(Page page, ScenicVo scenicVo);
}
