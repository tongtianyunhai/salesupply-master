package com.javasm.salesupply.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.salesupply.common.page.PageResult;
import com.javasm.salesupply.domain.criteria.ClassifyCriteria;
import com.javasm.salesupply.domain.entity.GdClassify;
import com.javasm.salesupply.domain.vo.ClassifyVO;
import com.javasm.salesupply.mapper.GdClassifyDao;
import com.javasm.salesupply.service.GdClassifyService;
import com.javasm.salesupply.transfer.ClassifyTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * (GdClassify)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 14:57:42
 */
@Service
public class GdClassifyServiceImpl extends ServiceImpl<GdClassifyDao, GdClassify> implements GdClassifyService {
    @Resource
    private GdClassifyDao gdClassifyDao;
    @Autowired
    private ClassifyTransfer classifyTransfer;

    /**
     * 通过ID查询单条数据
     *
     * @param classifyId 主键
     * @return 实例对象
     */
    @Override
    public GdClassify queryById(Integer classifyId) {
        return this.gdClassifyDao.queryById(classifyId);
    }

    /**
     * 查询多条数据

     * @return 对象列表
     */
    @Override
    public List<GdClassify> queryAllByLimit() {
        return this.gdClassifyDao.queryAllByLimit();
    }

    /**
     * 新增数据
     *
     * @param gdClassify 实例对象
     * @return 实例对象
     */
    @Override
    public GdClassify insert(GdClassify gdClassify) {
        this.gdClassifyDao.insert(gdClassify);
        return gdClassify;
    }

    /**
     * 修改数据
     *
     * @param gdClassify 实例对象
     * @return 实例对象
     */
    @Override
    public GdClassify update(GdClassify gdClassify) {
        this.gdClassifyDao.update(gdClassify);
        return this.queryById(gdClassify.getClassifyId());
    }

    /**
     * 通过主键删除数据
     *
     * @param classifyId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer classifyId) {
        return this.gdClassifyDao.deleteById(classifyId) > 0;
    }

    @Override
    public List<GdClassify> primaryClassification() {
        return gdClassifyDao.primaryClassification();
    }

    @Override
    public List<GdClassify> secondLevelDirectory(Integer classifyId) {
        return gdClassifyDao.secondLevelDirectory(classifyId);
    }

    @Override
    public PageResult<ClassifyVO> searchPageByCriteria(ClassifyCriteria classifyCriteria) {
        Integer currentPage = classifyCriteria.getCurrentPage();
        Integer pageSize = classifyCriteria.getPageSize();

        if (StringUtils.isEmpty(currentPage)) {
            currentPage = 1;
        }
        if (StringUtils.isEmpty(pageSize)) {
            pageSize = 5;
        }
        Integer rid1 = classifyCriteria.getRid1();
        Integer rid2 = classifyCriteria.getRid2();


        PageHelper.startPage(currentPage, pageSize);
        List<GdClassify> gdClassifies = gdClassifyDao.searchPageByCriteria(classifyCriteria);
        if (!StringUtils.isEmpty(rid1) && StringUtils.isEmpty(rid2)) {

        }

        PageInfo<GdClassify> gdClassifyPageInfo = new PageInfo<>(gdClassifies);
        long total = gdClassifyPageInfo.getTotal();
        List<ClassifyVO> classifyVOList = classifyTransfer.toVO(gdClassifies);
        return new PageResult<>(total, classifyVOList);
    }

}