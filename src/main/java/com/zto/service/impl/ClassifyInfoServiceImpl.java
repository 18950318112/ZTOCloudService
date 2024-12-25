package com.zto.service.impl;

import com.zto.entity.ClassifyInfo;
import com.zto.dao.ClassifyInfoMap;
import com.zto.service.ClassifyInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 分类表(ClassifyInfo)表服务实现类
 *
 * @author makejava
 * @since 2024-12-24 17:02:52
 */
@Service("classifyInfoService")
public class ClassifyInfoServiceImpl implements ClassifyInfoService {
    @Resource
    private ClassifyInfoMap classifyInfoMap;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ClassifyInfo queryById(Integer id) {
        return this.classifyInfoMap.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param classifyInfo 筛选条件
     * @param pageRequest  分页对象
     * @return 查询结果
     */
    @Override
    public Page<ClassifyInfo> queryByPage(ClassifyInfo classifyInfo, PageRequest pageRequest) {
        long total = this.classifyInfoMap.count(classifyInfo);
        return new PageImpl<>(this.classifyInfoMap.queryAllByLimit(classifyInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param classifyInfo 实例对象
     * @return 实例对象
     */
    @Override
    public ClassifyInfo insert(ClassifyInfo classifyInfo) {
        this.classifyInfoMap.insert(classifyInfo);
        return classifyInfo;
    }

    /**
     * 修改数据
     *
     * @param classifyInfo 实例对象
     * @return 实例对象
     */
    @Override
    public ClassifyInfo update(ClassifyInfo classifyInfo) {
        this.classifyInfoMap.update(classifyInfo);
        return this.queryById(classifyInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.classifyInfoMap.deleteById(id) > 0;
    }
}
