package com.brownsuagr.qasystem.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper=false)
@Accessors(chain = true)
@NoArgsConstructor          //无参构造
@AllArgsConstructor         //全参构造
public class ModelVO implements Serializable {

    private Integer id;
    private String category;
    private Integer sum;


}
