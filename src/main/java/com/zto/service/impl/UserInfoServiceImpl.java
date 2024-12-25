package com.zto.service.impl;

import com.zto.entity.UserInfo;
import com.zto.dao.UserInfoMap;
import com.zto.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 用户信息(UserInfo)表服务实现类
 *
 * @author makejava
 * @since 2024-12-25 09:31:15
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoMap userInfoMap;

    @Override
    public String userAuth(UserInfo userInfo) {

        UserInfo userInfoActual =this.getUserInfoByUserName(userInfo.getUserName());
        if(userInfoActual == null){

            return "用户不存在";
        }

        if(!userInfoActual.getUserPassword().equals(userInfo.getUserPassword())){

            return "密码不正确";
        }

        return "验证成功";
    }

    @Override
    public UserInfo getUserInfoByUserName(String userName) {

        return userInfoMap.getUserInfoByUserName(userName);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserInfo queryById(Integer id) {
        return this.userInfoMap.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userInfo    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<UserInfo> queryByPage(UserInfo userInfo, PageRequest pageRequest) {
        long total = this.userInfoMap.count(userInfo);
        return new PageImpl<>(this.userInfoMap.queryAllByLimit(userInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UserInfo insert(UserInfo userInfo) {
        this.userInfoMap.insert(userInfo);
        return userInfo;
    }

    /**
     * 修改数据
     *
     * @param userInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UserInfo update(UserInfo userInfo) {
        this.userInfoMap.update(userInfo);
        return this.queryById(userInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userInfoMap.deleteById(id) > 0;
    }
}
