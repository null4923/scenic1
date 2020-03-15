package com.bawei.scenic.mapper;

import com.bawei.scenic.entity.Nation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bawei.scenic.entity.NationVo;

import java.util.List;

/**
 * <p>
 * 城市字典表 Mapper 接口
 * </p>
 *
 * @author qyc
 * @since 2020-03-15
 */
public interface NationMapper extends BaseMapper<Nation> {

    List<NationVo> findAll();
}
