package com.brownsuagr.qasystem.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.brownsuagr.qasystem.entity.BaseEntity;
import com.brownsuagr.qasystem.entity.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;


@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
@NoArgsConstructor          //无参构造
@AllArgsConstructor         //全参构造
public class QuestionModelVO extends BaseEntity {


    private String question;
    private String answer;
    private String name;
    private String keyword;

}
