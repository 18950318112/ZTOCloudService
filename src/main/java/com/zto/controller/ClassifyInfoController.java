package com.zto.controller;

import com.zto.entity.ClassifyInfo;
import com.zto.service.ClassifyInfoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 分类表(ClassifyInfo)表控制层
 *
 * @author makejava
 * @since 2024-12-24 16:48:02
 */
@RestController
@RequestMapping("classifyInfo")
public class ClassifyInfoController {
    /**
     * 服务对象
     */
    @Resource
    private ClassifyInfoService classifyInfoService;

    /**
     * 分页查询
     *
     * @param classifyInfo 筛选条件
     * @param pageRequest  分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<ClassifyInfo>> queryByPage(ClassifyInfo classifyInfo, PageRequest pageRequest) {
        return ResponseEntity.ok(this.classifyInfoService.queryByPage(classifyInfo, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ClassifyInfo> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.classifyInfoService.queryById(id));
    }



    /**
     * 新增数据
     *
     * @param classifyInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ClassifyInfo> add(ClassifyInfo classifyInfo) {
        return ResponseEntity.ok(this.classifyInfoService.insert(classifyInfo));
    }

    /**
     * 编辑数据
     *
     * @param classifyInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ClassifyInfo> edit(ClassifyInfo classifyInfo) {
        return ResponseEntity.ok(this.classifyInfoService.update(classifyInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.classifyInfoService.deleteById(id));
    }

}

