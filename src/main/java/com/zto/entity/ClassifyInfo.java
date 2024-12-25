package com.zto.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 分类表(ClassifyInfo)实体类
 *
 * @author makejava
 * @since 2024-12-24 16:48:04
 */
@Data
public class ClassifyInfo implements Serializable {
    private static final long serialVersionUID = -58549668513076759L;

    private Integer id;

    private String classifyName;

    private String imagesUrl;
}

