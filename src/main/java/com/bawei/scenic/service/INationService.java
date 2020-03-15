package com.bawei.scenic.service;

import com.bawei.scenic.entity.Nation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bawei.scenic.entity.NationVo;

import java.util.List;

/**
 * <p>
 * 城市字典表 服务类
 * </p>
 *
 * @author qyc
 * @since 2020-03-15
 */
public interface INationService extends IService<Nation> {

    /**
     * 查询所有的数据
     * @return
     */
    List<NationVo> findAll();
}
