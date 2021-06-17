package com.brownsuagr.qasystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.brownsuagr.qasystem.entity.Model;
import com.brownsuagr.qasystem.vo.ModelVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * Copyright: Copyright (c) 2020 Brown Sugar
 *
 * @ClassName: com.libnet.mppper.LiteratureDao
 * @Description: 模块持久层映射文件
 * @Author: 黑糖
 * @Date: 2020-09-15 17:02
 */
@Mapper
public interface ModelMapper extends BaseMapper<Model> {

    @Select("SELECT mm.id,mm.name AS category,t.sum\n" +
            "FROM model mm\n" +
            "RIGHT JOIN (\n" +
            "\tSELECT temp.name AS category,COUNT(*) AS sum\n" +
            "\tFROM(\n" +
            "\t\tSELECT q.mode_id,m.name\n" +
            "\t\tFROM question q\n" +
            "\t\tRIGHT JOIN model m\n" +
            "\t\tON q.mode_id = m.id\n" +
            "\t) AS temp\n" +
            "\tGROUP BY temp.name\n" +
            ") t\n" +
            "ON mm.name = t.category")
    List<ModelVO> getModeAndSumList();

    @Select("SELECT id,name,description FROM model")
    List<Model> getModeList();
}
