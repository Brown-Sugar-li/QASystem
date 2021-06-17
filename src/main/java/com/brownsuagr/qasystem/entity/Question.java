package com.brownsuagr.qasystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@TableName("question")
public class Question extends BaseEntity {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String question;
    private String answer;
    private Integer modeId;
    private String keyword;
    private String email;
}
