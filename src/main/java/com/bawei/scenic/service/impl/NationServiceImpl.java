package com.bawei.scenic.service.impl;

import com.bawei.scenic.entity.Nation;
import com.bawei.scenic.entity.NationVo;
import com.bawei.scenic.mapper.NationMapper;
import com.bawei.scenic.service.INationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 城市字典表 服务实现类
 * </p>
 *
 * @author qyc
 * @since 2020-03-15
 */
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

    @Autowired
    private NationMapper nationMapper;
    @Override
    public List<NationVo> findAll() {
        return nationMapper.findAll();
    }
}
