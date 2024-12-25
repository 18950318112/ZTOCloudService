package com.zto.dao;

import com.zto.entity.ClassifyInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 分类表(ClassifyInfo)表数据库访问层
 *
 * @author makejava
 * @since 2024-12-24 16:48:04
 */
@Mapper
public interface ClassifyInfoMap {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ClassifyInfo queryById(Integer id);

    Integer testQuery();

    /**
     * 查询指定行数据
     *
     * @param classifyInfo 查询条件
     * @param pageable     分页对象
     * @return 对象列表
     */
    List<ClassifyInfo> queryAllByLimit(ClassifyInfo classifyInfo, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param classifyInfo 查询条件
     * @return 总行数
     */
    long count(ClassifyInfo classifyInfo);

    /**
     * 新增数据
     *
     * @param classifyInfo 实例对象
     * @return 影响行数
     */
    int insert(ClassifyInfo classifyInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ClassifyInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ClassifyInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ClassifyInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ClassifyInfo> entities);

    /**
     * 修改数据
     *
     * @param classifyInfo 实例对象
     * @return 影响行数
     */
    int update(ClassifyInfo classifyInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

