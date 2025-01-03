package com.zto.dao;

import com.zto.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户信息(UserInfo)表数据库访问层
 *
 * @author makejava
 * @since 2024-12-25 09:31:11
 */
@Mapper
public interface UserInfoMap {


    /**
     * 通过用户名查询单条数据
     *
     * @param userName
     * @return 实例对象
     */
    UserInfo getUserInfoByUserName(String userName);


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserInfo queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param userInfo 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<UserInfo> queryAllByLimit(UserInfo userInfo, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param userInfo 查询条件
     * @return 总行数
     */
    long count(UserInfo userInfo);

    /**
     * 新增数据
     *
     * @param userInfo 实例对象
     * @return 影响行数
     */
    int insert(UserInfo userInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserInfo> entities);

    /**
     * 修改数据
     *
     * @param userInfo 实例对象
     * @return 影响行数
     */
    int update(UserInfo userInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

