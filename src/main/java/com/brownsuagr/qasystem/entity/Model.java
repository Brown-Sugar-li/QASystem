package com.brownsuagr.qasystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Copyright: Copyright (c) 2020 Brown Sugar
 *
 * @ClassName: com.libnet.entity.Model
 * @Description: 文献模块实体表
 * @Author: 黑糖
 * @Date: 2020-09-15 15:56
 */

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName("model")
public class Model extends BaseEntity {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String description;
}
