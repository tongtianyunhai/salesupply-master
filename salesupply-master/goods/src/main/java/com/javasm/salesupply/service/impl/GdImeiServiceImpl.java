package com.javasm.salesupply.service.impl;

import com.javasm.salesupply.domain.entity.GdImei;
import com.javasm.salesupply.mapper.GdImeiDao;
import com.javasm.salesupply.service.GdImeiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GdImei)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@Service
public class GdImeiServiceImpl implements GdImeiService {
    @Resource
    private GdImeiDao gdImeiDao;

    /**
     * 通过ID查询单条数据
     *
     * @param imeiId 主键
     * @return 实例对象
     */
    @Override
    public GdImei queryById(Integer imeiId) {
        return this.gdImeiDao.queryById(imeiId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<GdImei> queryAllByLimit(int offset, int limit) {
        return this.gdImeiDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param gdImei 实例对象
     * @return 实例对象
     */
    @Override
    public GdImei insert(GdImei gdImei) {
        this.gdImeiDao.insert(gdImei);
        return gdImei;
    }

    /**
     * 修改数据
     *
     * @param gdImei 实例对象
     * @return 实例对象
     */
    @Override
    public GdImei update(GdImei gdImei) {
        this.gdImeiDao.update(gdImei);
        return this.queryById(gdImei.getImeiId());
    }

    /**
     * 通过主键删除数据
     *
     * @param imeiId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer imeiId) {
        return this.gdImeiDao.deleteById(imeiId) > 0;
    }
}