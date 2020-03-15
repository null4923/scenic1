package com.bawei.scenic.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bawei.scenic.entity.Scenic;
import com.bawei.scenic.entity.ScenicVo;
import com.bawei.scenic.mapper.ScenicMapper;
import com.bawei.scenic.service.IScenicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qyc
 * @since 2020-03-15
 */
@Service
public class ScenicServiceImpl extends ServiceImpl<ScenicMapper, Scenic> implements IScenicService {

    @Autowired
    private ScenicMapper scenicMapper;
    @Override
    public IPage<Scenic> selectScenicpageVo(Page page, ScenicVo scenicVo) {
        return scenicMapper.selectScenicpageVo(page,scenicVo);
    }
}
