package com.zto.service;

import com.zto.entity.ClassifyInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 分类表(ClassifyInfo)表服务接口
 *
 * @author makejava
 * @since 2024-12-24 16:48:04
 */
public interface ClassifyInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ClassifyInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param classifyInfo 筛选条件
     * @param pageRequest  分页对象
     * @return 查询结果
     */
    Page<ClassifyInfo> queryByPage(ClassifyInfo classifyInfo, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param classifyInfo 实例对象
     * @return 实例对象
     */
    ClassifyInfo insert(ClassifyInfo classifyInfo);

    /**
     * 修改数据
     *
     * @param classifyInfo 实例对象
     * @return 实例对象
     */
    ClassifyInfo update(ClassifyInfo classifyInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
